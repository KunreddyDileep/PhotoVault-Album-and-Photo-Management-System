package org.studyeasy.SpringRestdemo.config;

import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.*;


@Configuration
@OpenAPIDefinition(
  info =@Info(
    title = "PhotoVault-Album-and-Photo-Management-System API",
    version = "Verions 1.0",
    contact = @Contact(
      name = "Dileep Reddy Kunreddy", email = "dileepreddy2703@gmail.com"
    ),
    license = @License(
      name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0"
    ),
    termsOfService = "https://studyeasy.org/",
    description = "Spring Boot RestFul API Demo by Dileep Reddy Kunreddy"
  )
)
public class SwaggerConfig {
}
