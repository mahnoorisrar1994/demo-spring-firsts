package com.example.demospringfirsts.Service;

import org.springframework.stereotype.Component;

@Component
public class GreetingsServiceAlternativeImpl implements GreetingsService {

    @Override
    public String getGreeting(){
        return "Hi";
    }
}
