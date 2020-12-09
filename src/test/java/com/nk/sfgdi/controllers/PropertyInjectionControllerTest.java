package com.nk.sfgdi.controllers;

import com.nk.sfgdi.services.ConstructorServiceImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectionControllerTest {
    PropertyInjectionController controller;
    @BeforeEach
    void setUp() {
        controller = new PropertyInjectionController();
        controller.greetingService=new ConstructorServiceImp();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.greetingService.greeting());
    }
}