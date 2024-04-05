package vn.com.atomi.loyalty.partnergateway.dto.output;

import lombok.Getter;
import lombok.Setter;

/**
 * @author haidv
 * @version 1.0
 */
@Setter
@Getter
public class GenerateCodeOutput {

  private Code[] codes;

  private String transactionId;

  private VoucherInfo voucherInfo;

  @Setter
  @Getter
  public static class Code {

    private long id;

    private String code;

    private long expiredAt;

    private long price;
  }
}
