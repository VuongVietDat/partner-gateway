package vn.com.atomi.loyalty.partnergateway.dto.output;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author haidv
 * @version 1.0
 */
@Setter
@Getter
public class VoucherInfo {

  private String id;

  private String name;

  private String title;

  private String description;

  private String guide;

  private String termsOfUse;

  private String[] images;

  private String thumnail;

  private Shop[] shops;

  private VoucherRank[] voucherRank;

  @Setter
  @Getter
  public static class Shop {

    private String id;

    private String name;

    private String address;

    private String lat;

    @JsonProperty("long")
    private String addLong;
  }

  @Setter
  @Getter
  public static class VoucherRank {

    private long id;

    private String name;

    private long price;
  }
}
