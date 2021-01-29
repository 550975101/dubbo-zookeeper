package com.cctv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 封心
 */
@SpringBootApplication
public class OrderProviderApplication {

  private static final Logger logger = LoggerFactory.getLogger(OrderProviderApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(OrderProviderApplication.class);
    logger.info("ProviderApplication start!");
  }

}
