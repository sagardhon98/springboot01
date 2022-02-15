package com.ci.config;

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
public class swaggerConfiguration {

	@Bean
	public Docket apiInfo() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("Employee Application")
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.ci"))
				.paths(PathSelectors.any())
				.build().apiInfo(metaData());
	}
	
	private ApiInfo metaData() {
		return new ApiInfoBuilder()
				.title("Employee Application")
				.description("Swagger configuration for Employee application.")
				.version("0.0.v1")
				.license("Apache")
				.licenseUrl("www.google.com")
				.contact(new Contact("Sagar Dhon", "www.google.com", "sagar@gmail.com"))
				.build();
	}
}
