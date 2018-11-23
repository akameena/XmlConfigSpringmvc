package com.anil.Udemy2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("a1")
public class Annotation1 implements Annotationbase {
		private Ab2 ab2;
		
		@Autowired //this time it is not necessary
		public Annotation1(Ab2 ab2) {
			this.ab2 = ab2;
	}


		
		public void annotationBase() {
		System.out.println("annotion1 is here");
		ab2.defineab2();
	}

}
