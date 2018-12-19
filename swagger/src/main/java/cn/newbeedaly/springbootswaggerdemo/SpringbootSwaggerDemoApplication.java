package cn.newbeedaly.springbootswaggerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// @SpringBootApplication注解上加上exclude，解除自动加载DataSourceAutoConfiguration。
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringbootSwaggerDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootSwaggerDemoApplication.class, args);
  }
}
