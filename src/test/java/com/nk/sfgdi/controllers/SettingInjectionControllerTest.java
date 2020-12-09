package com.nk.sfgdi.controllers;

import com.nk.sfgdi.services.ConstructorServiceImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SettingInjectionControllerTest {
    SettingInjectionController controller;
    @BeforeEach
    void setUp() {
        controller=new SettingInjectionController();
        controller.setGreetingService(new ConstructorServiceImp());
    }

    @Test
    void setGreetingService() {
        System.out.println(controller.getGreeting());
    }
}