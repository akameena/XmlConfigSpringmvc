package com.anil.javabase;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Languages obj = context.getBean("java", Languages.class);
		obj.languageName();
		context.close();
		
		
	}

}
