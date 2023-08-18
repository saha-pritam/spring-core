package org.pritam.springcore;

public class Model {
	public Model(double x ,double y){
		System.out.println("Constructor with two double");
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
	}
	
	public Model(int x ,int y){
		System.out.println("Constructor with two integers");
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
	}
}
