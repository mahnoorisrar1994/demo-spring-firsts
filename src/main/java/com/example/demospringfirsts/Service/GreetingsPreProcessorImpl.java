package com.example.demospringfirsts.Service;

import org.springframework.stereotype.Component;

@Component
public class GreetingsPreProcessorImpl implements GreetingsPreProcessor{

    @Override
    public String preprocess(String s){
        return s;
    }
}
