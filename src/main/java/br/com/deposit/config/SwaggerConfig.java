package br.com.deposit.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
public class SwaggerConfig {
    @Bean
    public Info info() {
        return new Info()
                .title("ms-deposit - Deposit API")
                .description("API REST que faz depósitos nas carteiras.");
    }

    @Bean
    public Components components() {
        return new Components();
    }

    @Bean
    public OpenAPI customOpenAPI(@Autowired Info info, @Autowired Components components) {
        return new OpenAPI()
                .components(components)
                .info(info);
    }

}
