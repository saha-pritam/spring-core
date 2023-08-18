package org.pritam.springcore;

public class ModelB {
	
	private int y;
	
	public ModelB() {
		System.out.println("This is ModelB().");
	}

	public ModelB(int y) {
		System.out.println("This is ModelB().");
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		System.out.println("This is setY().");
		this.y = y;
	}

	@Override
	public String toString() {
		return "ModelB [y=" + y + "]";
	}
}
