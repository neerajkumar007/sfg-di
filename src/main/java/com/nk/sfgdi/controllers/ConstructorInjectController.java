package com.nk.sfgdi.controllers;

import com.nk.sfgdi.services.GreetingService;

public class ConstructorInjectController {
    private final GreetingService greetingService;
    public ConstructorInjectController(GreetingService greetingService){
        this.greetingService=greetingService;

    }

    public String getGreeting(){
        return greetingService.greeting();
    }

}
