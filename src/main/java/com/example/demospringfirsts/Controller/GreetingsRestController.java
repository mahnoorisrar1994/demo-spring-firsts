package com.example.demospringfirsts.Controller;

import com.example.demospringfirsts.Service.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //returns http request
public class GreetingsRestController {
    private GreetingsService greetingsService;

    @Autowired
    public GreetingsRestController(GreetingsService greetingsService){
        this.greetingsService = greetingsService;
    }
    @GetMapping("/hi")
    public String sayHi(){
        return greetingsService.getGreeting();
    }
}
