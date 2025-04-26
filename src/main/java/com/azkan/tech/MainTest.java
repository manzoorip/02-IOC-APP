package com.azkan.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args)
	{
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("spring-beans.xml");
		Printer print=ctxt.getBean(Printer.class);
		print.printReceipt();
	}
}
