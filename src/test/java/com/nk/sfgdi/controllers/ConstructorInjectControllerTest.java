package com.nk.sfgdi.controllers;

import com.nk.sfgdi.services.GreetingServiceImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectControllerTest {
    ConstructorInjectController controller;
    @BeforeEach
    void setUp() {
        controller= new ConstructorInjectController(new GreetingServiceImp());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}