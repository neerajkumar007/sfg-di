package com.nk.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterServiceImp implements GreetingService{
    @Override
    public String greeting() {
        return "My Test-Setter Injectoin";
    }
}
