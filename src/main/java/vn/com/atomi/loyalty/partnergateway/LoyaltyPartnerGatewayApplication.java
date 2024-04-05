package vn.com.atomi.loyalty.partnergateway;

import jakarta.annotation.PostConstruct;
import java.util.TimeZone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@ComponentScan(basePackages = "vn.com.atomi.loyalty")
@SpringBootApplication
@EnableFeignClients(basePackages = "vn.com.atomi.loyalty")
@ConfigurationPropertiesScan
@EnableSpringDataWebSupport
public class LoyaltyPartnerGatewayApplication {

  public static void main(String[] args) {
    SpringApplication.run(LoyaltyPartnerGatewayApplication.class, args);
  }

  @PostConstruct
  public void init() {
    TimeZone.setDefault(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
  }
}
