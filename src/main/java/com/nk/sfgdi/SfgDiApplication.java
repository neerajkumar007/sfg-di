package com.nk.sfgdi;

import com.nk.sfgdi.controllers.ConstructorInjectController;
import com.nk.sfgdi.controllers.MyController;
import com.nk.sfgdi.controllers.PropertyInjectionController;
import com.nk.sfgdi.controllers.SettingInjectionController;
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

		PropertyInjectionController propertyInjectionController = (PropertyInjectionController) mycontext.getBean("propertyInjectionController");
		System.out.println(propertyInjectionController.getGreeting());
		SettingInjectionController settingInjectionController =(SettingInjectionController) mycontext.getBean("settingInjectionController");
		System.out.println(settingInjectionController.getGreeting());
		ConstructorInjectController constructorInjectController =(ConstructorInjectController) mycontext.getBean("constructorInjectController");


		System.out.println(constructorInjectController.getGreeting());
	}

}
