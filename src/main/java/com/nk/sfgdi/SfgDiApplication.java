package com.nk.sfgdi;

import com.nk.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext mycontext=SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18nController = (I18nController)mycontext.getBean("i18nController");
		System.out.println(i18nController.greeting());

		MyController myController =(MyController) mycontext.getBean("myController");
		String test=myController.test();

		System.out.println("--"+myController.test());

		PropertyInjectionController propertyInjectionController = (PropertyInjectionController) mycontext.getBean("propertyInjectionController");
		System.out.println(propertyInjectionController.getGreeting());
		SettingInjectionController settingInjectionController =(SettingInjectionController) mycontext.getBean("settingInjectionController");
		System.out.println(settingInjectionController.getGreeting());
		ConstructorInjectController constructorInjectController =(ConstructorInjectController) mycontext.getBean("constructorInjectController");


		System.out.println(constructorInjectController.getGreeting());
	}

}
