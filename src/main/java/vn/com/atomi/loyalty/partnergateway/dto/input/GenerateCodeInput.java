package vn.com.atomi.loyalty.partnergateway.dto.input;

import lombok.Getter;
import lombok.Setter;

/**
 * @author haidv
 * @version 1.0
 */
@Setter
@Getter
public class GenerateCodeInput {

  private Long voucherId;

  private Long quantity;

  private String refId;
}
