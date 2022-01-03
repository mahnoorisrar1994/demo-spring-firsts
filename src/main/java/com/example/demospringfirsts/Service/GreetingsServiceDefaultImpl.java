package com.example.demospringfirsts.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingsServiceDefaultImpl implements GreetingsService {


    private GreetingsPreProcessor preProcessor;

    @Autowired
    public GreetingsServiceDefaultImpl(GreetingsPreProcessor preProcessor){
        this.preProcessor= preProcessor;
    }

    @Override
    public String getGreeting(){
        return preProcessor.preprocess("Hello");
    }
}
