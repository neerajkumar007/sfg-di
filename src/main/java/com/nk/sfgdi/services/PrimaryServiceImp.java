package com.nk.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class PrimaryServiceImp implements GreetingService{

    @Override
    public String greeting() {
        return "primary";
    }
}
