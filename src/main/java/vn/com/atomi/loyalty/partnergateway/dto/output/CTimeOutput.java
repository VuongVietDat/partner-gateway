package vn.com.atomi.loyalty.partnergateway.dto.output;

import lombok.Getter;
import lombok.Setter;

/**
 * @author haidv
 * @version 1.0
 */
@Setter
@Getter
public class CTimeOutput<T> {

  private long code;

  private String message;

  private T data;
}
