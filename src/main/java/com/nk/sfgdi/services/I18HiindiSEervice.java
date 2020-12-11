package com.nk.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("HI")
@Service("i18nService")
public class I18HiindiSEervice implements GreetingService{
    @Override
    public String greeting() {
        return "Namaste";
    }
}
