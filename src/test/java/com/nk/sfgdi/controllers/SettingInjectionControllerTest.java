package com.nk.sfgdi.controllers;

import com.nk.sfgdi.services.GreetingServiceImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SettingInjectionControllerTest {
    SettingInjectionController controller;
    @BeforeEach
    void setUp() {
        controller=new SettingInjectionController();
        controller.setGreetingService(new GreetingServiceImp());
    }

    @Test
    void setGreetingService() {
        System.out.println(controller.getGreeting());
    }
}