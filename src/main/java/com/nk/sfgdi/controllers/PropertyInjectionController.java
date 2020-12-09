package com.nk.sfgdi.controllers;

import com.nk.sfgdi.services.GreetingService;

public class PropertyInjectionController {
    public GreetingService greetingService;
    public String getGreeting(){
        return greetingService.greeting();
    }
}
