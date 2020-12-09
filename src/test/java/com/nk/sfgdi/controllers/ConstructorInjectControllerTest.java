package com.nk.sfgdi.controllers;

import com.nk.sfgdi.services.ConstructorServiceImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectControllerTest {
    ConstructorInjectController controller;
    @BeforeEach
    void setUp() {
        controller= new ConstructorInjectController(new ConstructorServiceImp());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}