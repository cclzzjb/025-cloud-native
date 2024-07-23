package com.cloudnative.gateway.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

@Configuration
public class KeyResolverConfiguration {
    @Bean
    public KeyResolver pathKeyResolver(){
        System.out.println("666");
        return exchange -> Mono.just(exchange.getRequest().getURI().getPath());
    }
//    @Bean
//    public KeyResolver ipKeyResolver()
//    {
//        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
//    }

}
