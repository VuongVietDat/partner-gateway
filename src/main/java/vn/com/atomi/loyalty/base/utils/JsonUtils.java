package vn.com.atomi.loyalty.base.utils;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author haidv
 * @version 1.0
 */
public class JsonUtils {

  private static final Logger LOGGER = LoggerFactory.getLogger(JsonUtils.class);

  private JsonUtils() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * Convert object to json
   *
   * @param object Object
   * @return json
   */
  public static String toJson(Object object) {
    ObjectMapper mapper = new ObjectMapper();
    mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    mapper.setSerializationInclusion(Include.NON_NULL);
    mapper.registerModule(new JavaTimeModule());
    String jsonString = "";
    try {
      jsonString = mapper.writeValueAsString(object);
    } catch (JsonProcessingException e) {
      LOGGER.error("Can't build json from object", e);
    }
    return jsonString;
  }

  /**
   * Gets the json by binding to the specified object.
   *
   * @param valueType Type to bind json (any class)
   * @param json String json
   * @param <T> Type to bind json
   * @return Object
   */
  public static <T> T fromJson(String json, Class<T> valueType) {
    if (json == null) {
      return null;
    }

    T object = null;
    try {
      var objectMapper = new ObjectMapper();
      objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
      objectMapper.registerModule(new JavaTimeModule());
      object = objectMapper.readValue(json, valueType);
    } catch (IOException e) {
      LOGGER.error(e.getMessage());
    }

    return object;
  }

  /**
   * Gets the json by binding to the specified object.
   *
   * @param valueType Type to bind json (any class)
   * @param json String json
   * @param <T> Type to bind json
   * @return Object
   */
  public static <T> T fromJson(Object json, Class<T> valueType) {
    if (json == null) {
      return null;
    }

    T object = null;
    try {
      var objectMapper = new ObjectMapper();
      objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
      objectMapper.registerModule(new JavaTimeModule());
      object = objectMapper.convertValue(json, valueType);
    } catch (Exception e) {
      LOGGER.error(e.getMessage());
    }

    return object;
  }

  /**
   * Gets the json by binding to the specified object.
   *
   * @param parentType Type to bind json (any class)
   * @param json String json
   * @param <T> Type to bind json
   * @return Object
   */
  public static <T> T fromJson(String json, Class<?> parentType, Class<?> chilType) {
    if (json == null) {
      return null;
    }

    T object = null;
    try {
      var objectMapper = new ObjectMapper();
      objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
      objectMapper.registerModule(new JavaTimeModule());
      JavaType type = objectMapper.getTypeFactory().constructParametricType(parentType, chilType);
      object = objectMapper.readValue(json, type);
    } catch (IOException e) {
      LOGGER.error(e.getMessage());
    }

    return object;
  }
}
