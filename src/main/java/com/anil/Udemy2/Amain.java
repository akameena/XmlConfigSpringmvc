package com.anil.Udemy2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Amain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aconfig.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Annotationbase obj = context.getBean("a1", Annotationbase.class);
		obj.annotationBase();
		Ab2 obj2 = context.getBean("a2",Ab2.class);
		obj2.defineab2();
		context.close();

	}

}
