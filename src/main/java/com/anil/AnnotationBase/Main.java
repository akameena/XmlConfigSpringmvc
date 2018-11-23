package com.anil.AnnotationBase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("Annotationbase.xml");
		Nameob\context.getBean("myname", Myname.class);
		

	}

}
