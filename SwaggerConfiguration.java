package com.shravani.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	    @Bean
	    public Docket api() { 
	        return new Docket(DocumentationType.SWAGGER_2)  
	          .groupName("public-api")
	          .apiInfo(apiInfo())
	          .select()                                  
	          .apis(RequestHandlerSelectors.basePackage("com.shravani"))              
	          .paths(PathSelectors.any())                          
	          .build();                                           
	    }

		private ApiInfo apiInfo() {
	         return new ApiInfoBuilder().title("ELIG-DETLS-DB")
	        		                    .description("Eligiblity details database")
	        		                    .version("")
	        		                    .build();
}
}