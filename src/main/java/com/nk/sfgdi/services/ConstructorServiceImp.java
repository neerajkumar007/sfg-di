package com.nk.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorServiceImp implements GreetingService{
    @Override
    public String greeting() {
        return "My Test-Constructor";
    }
}
