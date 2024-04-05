package vn.com.atomi.loyalty.partnergateway.dto.output;

import lombok.Getter;
import lombok.Setter;

/**
 * @author haidv
 * @version 1.0
 */
@Setter
@Getter
public class VoucherCodeInfo {

  private String id;

  private String code;

  private String customerId;

  private String customerPhone;

  private String customerName;

  private String voucherId;

  private long usedAt;

  private long expiredAt;

  private String status;

  private String transactionId;

  private long price;
}
