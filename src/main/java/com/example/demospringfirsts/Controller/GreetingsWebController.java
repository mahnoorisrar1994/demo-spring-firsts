package com.example.demospringfirsts.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Map;

@Controller //does not create the response directly
public class GreetingsWebController {

    //injected value through a property
    @Value("${welcome.message:World}")
    private String welcomeMessage;

    @RequestMapping("/")
    public String welcome(Map<String, Object> model){
        model.put("message", "World");
        return "index";
    }
}
