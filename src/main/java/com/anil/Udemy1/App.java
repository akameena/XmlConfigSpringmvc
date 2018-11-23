package com.anil.Udemy1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Coach coach = context.getBean("coach", Coach.class);
        
        coach.workOut();
        coach.rule();
        System.out.println();
        
        
        context.close();   
    }
   
    
}
