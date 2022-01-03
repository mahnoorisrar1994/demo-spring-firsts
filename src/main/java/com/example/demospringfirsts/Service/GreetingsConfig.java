package com.example.demospringfirsts.Service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingsConfig {

    @Bean
    public GreetingsService greetingsService(GreetingsPreProcessor preProcessor){
        return new GreetingsServiceDefaultImpl(preProcessor);
    }
}
