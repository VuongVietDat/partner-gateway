package vn.com.atomi.loyalty.base.data;

import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import vn.com.atomi.loyalty.base.exception.BaseException;
import vn.com.atomi.loyalty.base.exception.CommonErrorCode;
import vn.com.atomi.loyalty.base.security.UserPrincipal;
import vn.com.atomi.loyalty.notification.mapper.ModelMapper;

/**
 * This is the super interface for the service class of applications. <br>
 * The service provides methods for read / write operations on multiple entities using resource
 * classes. <br>
 * This interface defines the most common methods that should be supported in all service classes.
 *
 * @author haidv
 * @version 1.0
 */
public abstract class BaseService {

  /** Common logger for use in subclasses. */
  protected final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

  protected ModelMapper modelMapper = Mappers.getMapper(ModelMapper.class);

  protected Authentication getCurrentAuthentication() {
    return SecurityContextHolder.getContext().getAuthentication();
  }

  protected String getCurrentUserId() {
    var authentication = getCurrentAuthentication();
    if (authentication != null) {
      return authentication.getName();
    }
    throw new BaseException(CommonErrorCode.UNAUTHORIZED);
  }

  protected UserPrincipal getCurrentUserPrincipal() {
    var authentication = getCurrentAuthentication();
    if (authentication != null) {
      return (UserPrincipal) authentication.getPrincipal();
    }
    throw new BaseException(CommonErrorCode.UNAUTHORIZED);
  }
}
