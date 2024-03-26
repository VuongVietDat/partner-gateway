package vn.com.atomi.loyalty.partnergateway.feign.fallback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;
import vn.com.atomi.loyalty.partnergateway.feign.LoyaltyCoreClient;

/**
 * @author haidv
 * @version 1.0
 */
@Component
@Slf4j
public class LoyaltyCoreClientFallbackFactory implements FallbackFactory<LoyaltyCoreClient> {
  @Override
  public LoyaltyCoreClient create(Throwable cause) {
    log.error("An exception occurred when calling the LoyaltyCommonClient", cause);

    return new LoyaltyCoreClient() {
    };
  }
}
