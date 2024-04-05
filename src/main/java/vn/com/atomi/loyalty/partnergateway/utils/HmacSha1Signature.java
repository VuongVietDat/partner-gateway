package vn.com.atomi.loyalty.partnergateway.utils;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * @author haidv
 * @version 1.0
 */
public class HmacSha1Signature {

  private static final String HMAC_SHA1_ALGORITHM = "HmacSHA1";

  public static String generateCheckSum(String data, String key)
      throws NoSuchAlgorithmException, InvalidKeyException {
    return Base64.getEncoder().encodeToString(calculateRFC2104HMAC(data, key));
  }

  public static byte[] calculateRFC2104HMAC(String data, String key)
      throws NoSuchAlgorithmException, InvalidKeyException {
    SecretKeySpec signingKey = new SecretKeySpec(key.getBytes(), HMAC_SHA1_ALGORITHM);
    Mac mac = Mac.getInstance(HMAC_SHA1_ALGORITHM);
    mac.init(signingKey);
    return mac.doFinal(data.getBytes());
  }
}
