package vn.com.atomi.loyalty.notification.feign;

import org.springframework.cloud.openfeign.FeignClient;
import vn.com.atomi.loyalty.notification.feign.fallback.LoyaltyCoreClientFallbackFactory;

/**
 * @author haidv
 * @version 1.0
 */
@FeignClient(
    name = "loyalty-core-service",
    url = "${custom.properties.loyalty-core-service-url}",
    fallbackFactory = LoyaltyCoreClientFallbackFactory.class)
public interface LoyaltyCoreClient {

}
