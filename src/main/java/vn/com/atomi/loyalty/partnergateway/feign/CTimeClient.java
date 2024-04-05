package vn.com.atomi.loyalty.partnergateway.feign;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import vn.com.atomi.loyalty.partnergateway.dto.input.GenerateCodeInput;
import vn.com.atomi.loyalty.partnergateway.dto.input.GetCodeInfoInput;
import vn.com.atomi.loyalty.partnergateway.dto.output.CTimeOutput;
import vn.com.atomi.loyalty.partnergateway.dto.output.GenerateCodeOutput;
import vn.com.atomi.loyalty.partnergateway.dto.output.VoucherInfo;
import vn.com.atomi.loyalty.partnergateway.feign.fallback.LoyaltyCoreClientFallbackFactory;

/**
 * @author haidv
 * @version 1.0
 */
@FeignClient(
    name = "ctime-client",
    url = "${custom.properties.ctime-client-url}",
    fallbackFactory = LoyaltyCoreClientFallbackFactory.class)
public interface CTimeClient {

  @Operation(summary = "API lấy danh sách eVoucher")
  @GetMapping("/api/voucher/get-list-voucher")
  CTimeOutput<VoucherInfo> getEVoucher(
      @RequestHeader String apikey, @RequestHeader Long apitime, @RequestHeader String checksum);

  @Operation(summary = "API lấy thông tin ưu đãi")
  @GetMapping("/api/voucher/get-voucher-info")
  CTimeOutput<VoucherInfo> getEVoucherInfo(
      @RequestHeader String apikey,
      @RequestHeader Long apitime,
      @RequestHeader String checksum,
      @RequestParam Long voucherId);

  @Operation(summary = "API lấy thông tin code của ưu đãi")
  @PostMapping("/voucher/get-codes-info")
  CTimeOutput<VoucherInfo> getCodeInfos(
      @RequestHeader String apikey,
      @RequestHeader Long apitime,
      @RequestHeader String checksum,
      @RequestBody GetCodeInfoInput getCodeInfoInput);

  @PostMapping("/api/voucher/get-code")
  CTimeOutput<GenerateCodeOutput> generateCodes(
      @RequestHeader String apikey,
      @RequestHeader Long apitime,
      @RequestHeader String checksum,
      @RequestBody GenerateCodeInput generateCodeInput);
}
