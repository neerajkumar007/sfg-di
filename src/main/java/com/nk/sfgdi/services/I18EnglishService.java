package com.nk.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("EN")
@Service("i18nService")
public class I18EnglishService implements GreetingService{
    @Override
    public String greeting() {
        return "Hello English";
    }
}
