package vn.com.atomi.loyalty.base.security;

/**
 * @author haidv
 * @version 1.0
 */
public class Authority {

  public static final String ROLE_SYSTEM = "hasAuthority('ROLE_SYSTEM')";

  public static class Rule {
    public static final String CREATE_RULE = "hasAuthority('CREATE_RULE')";
    public static final String UPDATE_RULE = "hasAuthority('UPDATE_RULE')";
    public static final String READ_RULE = "hasAuthority('READ_RULE')";
    public static final String APPROVE_RULE = "hasAuthority('APPROVE_RULE')";
  }

  public static class CustomerGroup {
    public static final String CREATE_CUSTOMER_GROUP = "hasAuthority('CREATE_CUSTOMER_GROUP')";
    public static final String UPDATE_CUSTOMER_GROUP = "hasAuthority('UPDATE_CUSTOMER_GROUP')";
    public static final String READ_CUSTOMER_GROUP = "hasAuthority('READ_CUSTOMER_GROUP')";
    public static final String APPROVE_CUSTOMER_GROUP = "hasAuthority('APPROVE_CUSTOMER_GROUP')";
  }

  public static class Gift {
    public static final String CREATE_GIFT = "hasAuthority('CREATE_GIFT')";
    public static final String UPDATE_GIFT = "hasAuthority('UPDATE_GIFT')";
    public static final String READ_GIFT = "hasAuthority('READ_GIFT')";
  }
}
