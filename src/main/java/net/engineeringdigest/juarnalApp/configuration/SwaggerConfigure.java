package net.engineeringdigest.juarnalApp.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfigure {

  @Bean
    public OpenAPI myCustom(){

      return new OpenAPI().info(new Info().title("Juarnal API").description("By Keshav Mukeria"));
    }
}
