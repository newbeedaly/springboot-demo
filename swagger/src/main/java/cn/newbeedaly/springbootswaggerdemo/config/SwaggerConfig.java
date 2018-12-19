package cn.newbeedaly.springbootswaggerdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 *  swagger配置类
 *
 *  create by liqk on 2018/12/12
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Bean
  public Docket createRestApi() {
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(apiInfo())
        .select()
        .apis(RequestHandlerSelectors.basePackage("cn.newbeedaly.springbootswaggerdemo"))
        .paths(PathSelectors.any())
        .build();
        //.enable(true) //默认为 true
  }

  /**
   * 项目信息
   */
  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title("Swagger测试项目 RESTful APIs")
        .version("1.0.0")
        .build();
  }
}
