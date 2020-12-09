package com.nk.sfgdi.controllers;

import com.nk.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {
    @Qualifier("propertyServiceImp")
    @Autowired
    public GreetingService greetingService;
    public String getGreeting(){
        return greetingService.greeting();
    }
}
