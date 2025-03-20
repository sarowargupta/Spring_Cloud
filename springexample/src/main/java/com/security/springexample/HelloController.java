package com.security.springexample;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")

    //also print its session id
    public String greet(HttpServletRequest request){
        return "Welcome to Telusko spring security learning camp " + request.getSession().getId();
    }
}
