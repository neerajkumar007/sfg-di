package com.nk.sfgdi.controllers;

import com.nk.sfgdi.services.PrimaryServiceImp;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final PrimaryServiceImp primaryServiceImp;
    public String  test(){
       return primaryServiceImp.greeting();
    }

    public MyController(PrimaryServiceImp primaryServiceImp) {
        this.primaryServiceImp = primaryServiceImp;
    }
}
