package dev.rg.productservice.configurations;

import dev.rg.productservice.services.FakeStoreProductService;
import dev.rg.productservice.services.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

//    Make one ProductService as default through @Primary annotation
//    @Bean
//    @Primary
//    public ProductService productService(){
//        return new FakeStoreProductService(restTemplate());
//    }
}
