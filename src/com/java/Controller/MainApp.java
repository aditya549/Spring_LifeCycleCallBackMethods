package com.java.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Resources/spring.xml");
		context.registerShutdownHook();
		LifecycleMethods lm=(LifecycleMethods)context.getBean("lifecycle");
		lm.printProperties();	
	}
}

