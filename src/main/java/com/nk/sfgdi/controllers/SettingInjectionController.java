package com.nk.sfgdi.controllers;

import com.nk.sfgdi.services.GreetingService;

public class SettingInjectionController {
    private GreetingService greetingService;
    public void setGreetingService(GreetingService greetingService){
        this.greetingService=greetingService;

    }

    public String getGreeting() {
        return greetingService.greeting();
    }
}
