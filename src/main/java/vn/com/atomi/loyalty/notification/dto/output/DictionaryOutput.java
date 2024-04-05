package vn.com.atomi.loyalty.notification.dto.output;

import lombok.*;
import vn.com.atomi.loyalty.notification.enums.Status;

/**
 * @author haidv
 * @version 1.0
 */
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DictionaryOutput {

  private Long id;

  private String type;

  private String code;

  private String name;

  private int orderNo;

  private String value;

  private Status status;
}