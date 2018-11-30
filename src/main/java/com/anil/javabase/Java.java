package com.anil.javabase;

import org.springframework.beans.factory.annotation.Value;

public class Java implements Languages {

	@Value("${foo.id}")
	private String id;
	public void languageName() {
		// TODO Auto-generated method stub
		System.out.println(id);
		System.out.println("____Java____");

	}

}
