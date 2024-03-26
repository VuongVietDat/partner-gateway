package vn.com.atomi.loyalty.base.constant;

import java.util.Arrays;
import java.util.List;

/**
 * @author haidv
 * @version 1.0
 */
public class RequestConstant {

  public static final String REQUEST_ID = "X-Request-ID";

  public static final String CLIENT_IP = "X-Client-IP";

  public static final String CLIENT_TIME = "X-Client-Time";

  public static final String CLIENT_PLATFORM = "X-Client-Platform";

  public static final String LOCAL_IP = "X-Local-IP";

  public static final String KAFKA_EVENT = "KafkaListenerEvent";

  public static final String SERVICE_NAME = "service-name";

  public static final String REQUEST_TIME_START = "time-start";

  public static final String AUTHORIZATION = "authorization";

  public static final String REQUEST_LOGGING = "logging";

  public static final String BEARER_PREFIX = "Bearer ";

  public static final String BASIC_PREFIX = "Basic ";

  public static final String SECURE_API_KEY = "secure-api-key";

  public static final String SESSION_ID = "sessionId";

  public static final String DEVICE_ID = "X-Device-ID";

  public static final String DEVICE_TOKEN = "X-Device-Token";

  public static final String DEVICE_NAME = "X-Device-Name";

  public static final String DEVICE_TYPE = "X-Device-Type";

  public static final String BROWSER_NAME = "X-Browser-Name";

  public static final String APPLICATION_VERSION = "X-Application-Version";

  public static final String SYSTEM = "SYSTEM";

  public static final String ROLE_SYSTEM = "ROLE_SYSTEM";

  public static final List<String> WHITE_LIST_REQUEST =
      Arrays.asList(
          "/swagger-ui.html/**",
          "/swagger-resources/**",
          "/webjars/**",
          "/swagger-ui.html#!/**",
          "/v2/api-docs",
          "/v3/api-docs",
          "/v3/api-docs/**",
          "/actuator/**",
          "/css/**",
          "/js/**",
          "/**/*.png",
          "/**/*.gif",
          "/**/*.svg",
          "/**/*.jpg",
          "/**/*.html",
          "/**/*.css",
          "/**/*.js",
          "/favicon.ico",
          "/",
          "/error",
          "/csrf");

  public static final String[] HEADERS_TO_TRY = {
    "X-Forwarded-For",
    "Proxy-Client-IP",
    "WL-Proxy-Client-IP",
    "HTTP_X_FORWARDED_FOR",
    "HTTP_X_FORWARDED",
    "HTTP_X_CLUSTER_CLIENT_IP",
    "HTTP_CLIENT_IP",
    "HTTP_FORWARDED_FOR",
    "HTTP_FORWARDED",
    "HTTP_VIA",
    "REMOTE_ADDR"
  };

  private RequestConstant() {
    throw new IllegalStateException("Utility class");
  }

  public static List<String> getWhiteListRequest() {
    return WHITE_LIST_REQUEST;
  }
}
