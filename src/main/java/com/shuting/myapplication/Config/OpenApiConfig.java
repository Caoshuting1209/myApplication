package com.shuting.myapplication.Config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI creatOpenAPI(NamedParameterJdbcTemplate namedParameterJdbcTemplate){
        return new OpenAPI()
                .info(new Info()
                    .title("myApplication")
                    .version("1.0")
                    .description("user management application")
                    .license(new License()
                            .name("Apache 2.0")
                            .url(""))
                    .contact(new Contact()
                            .name("caoshuting")
                            .url("")
                            .email("1194261565@qq.com")));
    }

    public GroupedOpenApi groupedOpenApi(){
        return GroupedOpenApi.builder()
                .group("myApplication")
                .pathsToMatch("/api/**")
                .build();
    }
}
