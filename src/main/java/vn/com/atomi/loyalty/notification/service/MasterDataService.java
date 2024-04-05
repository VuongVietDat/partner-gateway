package vn.com.atomi.loyalty.notification.service;

import java.util.List;
import vn.com.atomi.loyalty.notification.dto.output.DictionaryOutput;
import vn.com.atomi.loyalty.notification.enums.Status;

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
