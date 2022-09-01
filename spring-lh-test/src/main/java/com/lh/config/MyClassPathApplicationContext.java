package com.lh.config;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Date:22/8/20 16:18
 *
 * @author LH
 */
public class MyClassPathApplicationContext extends ClassPathXmlApplicationContext {

  public MyClassPathApplicationContext(String... config) {
    super(config);
  }

  @Override
  protected void initPropertySources() {
    System.out.println("扩展initPropertySources");
    getEnvironment().setRequiredProperties("USERNAME");
  }

  @Override
  protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
    //    super.setAllowBeanDefinitionOverriding(false);
    //    super.setAllowCircularReferences(false);
    // 使用beanFactory设置值是直接设置属性，而不会使allowBeanDefinitionOverriding和allowCircularReferences有值
    beanFactory.setAllowBeanDefinitionOverriding(false);
    beanFactory.setAllowCircularReferences(false);
    super.customizeBeanFactory(beanFactory);
  }
}
