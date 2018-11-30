package com.anil.AnnotationBase;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("Annotationbase.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Annotationbase.xml");
		Name obj  = context.getBean("id1",Name.class);
		obj.fname();
		
		//Game obj2 = context.getBean("id2",Game.class);
		//obj2.gameName();
		context.close();
	}

}
