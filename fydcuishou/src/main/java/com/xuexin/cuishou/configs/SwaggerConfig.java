package com.xuexin.cuishou.configs;

import com.google.common.base.Predicate;
import org.springframework.boot.autoconfigure.web.BasicErrorController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Chandler on 2017/5/20.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(predicate())
                .build();
    }

    //接口文档标题
    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title(" API 文档")//大标题
                .description("包含接口认证等。")//详细描述
                .version("1.0")//版本
                .termsOfServiceUrl("NO terms of service")
                .build();
        return apiInfo;
    }
    private Predicate<RequestHandler> predicate(){
        Predicate<RequestHandler> predicate = new Predicate<RequestHandler>() {
            @Override
            public boolean apply(RequestHandler requestHandler) {
                Class<?> declaringClass = requestHandler.declaringClass();
                if (declaringClass == BasicErrorController.class){
                    return false;
                }
                return true;
            }
        };
        return predicate;
    }



}
