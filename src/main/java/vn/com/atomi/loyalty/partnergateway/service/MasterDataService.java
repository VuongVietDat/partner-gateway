package vn.com.atomi.loyalty.partnergateway.service;

import java.util.List;
import vn.com.atomi.loyalty.partnergateway.dto.output.DictionaryOutput;
import vn.com.atomi.loyalty.partnergateway.enums.Status;

/**
 * @author haidv
 * @version 1.0
 */
public interface MasterDataService {

  List<DictionaryOutput> getDictionary();

  List<DictionaryOutput> getDictionary(String type);

  List<DictionaryOutput> getDictionary(Status status);

  List<DictionaryOutput> getDictionary(String type, Status status);
}
