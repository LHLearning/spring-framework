package com.lh.config;

import com.lh.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Date:22/8/11 9:27
 *
 * @author LH
 */
@Configuration
public class MyConfig {
  @Bean
  public User getUser() {
    return new User("测试");
  }
}
