package com.java;



import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
	public static void main(String[] args) {
		//AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("app-context-xml.xml");
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:app-context-annotation.xml");
		ctx.refresh();
		MessageProvider messageProvider = ctx.getBean("messageProvider",
		MessageProvider.class);
		System.out.println(messageProvider.getMessage());
		ctx.close();
		}
}
