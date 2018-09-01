package com.sample.springutility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.swing.text.Document;

@SpringBootApplication
@EnableSwagger2
public class SpringUtilityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringUtilityApplication.class, args);
	}


	@Bean
	public Docket springFoxExampleDoc() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.regex("/test/.*"))
				.build();
	}
}
