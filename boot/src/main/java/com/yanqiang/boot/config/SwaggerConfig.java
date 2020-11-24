package com.yanqiang.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
//    @Bean
//    public Docket api(){
//        //创建docket的接口文档
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .pathMapping("/")
//                .select()
//                .paths(PathSelectors.regex("/.*"))
//                .build();
//    }
//
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yanqiang.boot.controller"))
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo());

    }

        private ApiInfo apiInfo() {
        return  new ApiInfoBuilder().title("标题：AA系统swagger 接口文档测试系统")
                .contact(new Contact("aa","","18217573010@163.com"))
                .description("SwaggerUi的接口文档")
                .version("1.0")
                .license("swagger ui")
                .build();

    }
}
