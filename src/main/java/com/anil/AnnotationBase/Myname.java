package com.anil.AnnotationBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("id1")
public class Myname implements Name {
	@Autowired
	private Cricket cricket;
	
	/*{
		System.out.println("i am in Ny name class");
	}*/
	public void fname() {
		System.out.println("my name fname is anil");
		cricket.gameName();
		
		
	}

}
