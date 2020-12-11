package com.nk.sfgdi.controllers;

import com.nk.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController implements GreetingService {
    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public String greeting() {
        return greetingService.greeting();
    }
}
