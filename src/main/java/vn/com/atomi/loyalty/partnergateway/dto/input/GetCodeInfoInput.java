package vn.com.atomi.loyalty.partnergateway.dto.input;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * @author haidv
 * @version 1.0
 */
@Setter
@Getter
public class GetCodeInfoInput {

  private List<String> codes;

  private String refId;
}
