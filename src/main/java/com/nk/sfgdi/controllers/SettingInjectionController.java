package com.nk.sfgdi.controllers;

import com.nk.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SettingInjectionController {

    private GreetingService greetingService;
    @Qualifier("setterServiceImp")
    @Autowired
    public void setGreetingService(GreetingService greetingService){
        this.greetingService=greetingService;

    }

    public String getGreeting() {
        return greetingService.greeting();
    }
}
