package com.lh.pojo;

import org.springframework.stereotype.Component;

/**
 * Date:22/8/11 7:58
 *
 * @author LH
 */
@Component
public class User {
  private String name;

  public User() {}

  public User(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "User{" + "name='" + name + '\'' + '}';
  }
}
