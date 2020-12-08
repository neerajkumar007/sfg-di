package com.nk.sfgdi;

import com.nk.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext mycontext=SpringApplication.run(SfgDiApplication.class, args);
		MyController myController =(MyController) mycontext.getBean("myController");
		String test=myController.test();

		System.out.println("--"+test);
	}

}
