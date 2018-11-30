package com.anil.javabase;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration 
@PropertySource("classpath:data")
public class JavaConfig {
	
	@Bean
	public Languages pythonBean()
	{
		return new  Python();
	}
	@Bean("java")
	public Languages javaBean()
	{
		return new Java();
	}
	
	
}
