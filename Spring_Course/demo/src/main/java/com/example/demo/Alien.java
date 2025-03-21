package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien
{

    //dependency injection
//    public void code()
//    {
//        System.out.println("Im Coding");
//    }



    //using the annotation autowired

    @Autowired
    Laptop lap;
    public void code()
    {
        lap.compile();
    }

}

