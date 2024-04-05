package vn.com.atomi.loyalty.partnergateway.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;
import vn.com.atomi.loyalty.base.constant.DateConstant;

/**
 * @author haidv
 * @version 1.0
 */
public class Utils {

  public static DateTimeFormatter LOCAL_DATETIME_FORMATTER =
      DateTimeFormatter.ofPattern(DateConstant.STR_PLAN_DD_MM_YYYY_HH_MM_SS_STROKE);
  public static DateTimeFormatter LOCAL_DATE_FORMATTER =
      DateTimeFormatter.ofPattern(DateConstant.STR_PLAN_DD_MM_YYYY_STROKE);

  private Utils() {
    throw new IllegalStateException("Utility class");
  }

  public static String generateUniqueId() {
    return UUID.randomUUID().toString();
  }

  public static String makeLikeParameter(String param) {
    return StringUtils.isBlank(param) ? null : "%" + param + "%";
  }

  public static LocalDateTime convertToLocalDateTime(String date) {
    return StringUtils.isEmpty(date) ? null : LocalDateTime.parse(date, LOCAL_DATETIME_FORMATTER);
  }

  public static LocalDateTime convertToLocalDateTimeStartDay(String date) {
    return StringUtils.isEmpty(date)
        ? null
        : LocalDateTime.parse(
            String.format("%s %s", date, Constants.DEFAULT_DAY_START_TIME),
            LOCAL_DATETIME_FORMATTER);
  }

  public static LocalDateTime convertToLocalDateTimeEndDay(String date) {
    return StringUtils.isEmpty(date)
        ? null
        : LocalDateTime.parse(
            String.format("%s %s", date, Constants.DEFAULT_DAY_END_TIME), LOCAL_DATETIME_FORMATTER);
  }

  public static LocalDate convertToLocalDate(String date) {
    return StringUtils.isEmpty(date) ? null : LocalDate.parse(date, LOCAL_DATE_FORMATTER);
  }

  public static String formatLocalDateTimeToString(LocalDateTime date) {
    return date == null ? null : LOCAL_DATETIME_FORMATTER.format(date);
  }

  public static String formatLocalDateToString(LocalDate date) {
    return date == null ? null : LOCAL_DATE_FORMATTER.format(date);
  }
}
