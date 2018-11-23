package com.anil.AnnotationBase;

import org.springframework.stereotype.Component;

@Component("myname")
public class Myname implements Name {

	public void fname() {
		System.out.println("my name fname is anil");

	}

}
