package com.anil.Udemy1;

public class Cricket implements Coach {
	
	private Rule rule;
	private Vision vision;
	private String name;
	private String id;
	
	
	 public void start()
	    {
	    	System.out.println("in start method");
	    }
	 public void end()
	    {
	    	System.out.println("in end method");
	    }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVision(Vision vision) {
		this.vision = vision;
	}

	public Cricket(Rule rule1) {
		rule = rule1;
	}

	public Cricket() {
		// TODO Auto-generated constructor stub
	}

	public void workOut() {
		// TODO Auto-generated method stub
		
		System.out.println("play Crircket with "+name+"id:"+id);

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void rule() {
		// TODO Auto-generated method stub
		rule.defineRule();
		vision.defineVision();
	}
	
}
