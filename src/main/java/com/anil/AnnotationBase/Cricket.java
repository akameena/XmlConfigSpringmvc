package com.anil.AnnotationBase;

import org.springframework.stereotype.Component;

@Component("id2")
public class Cricket implements Game {

	public void gameName() {
		// TODO Auto-generated method stub
		System.out.println("game name is cricket");

	}

}
