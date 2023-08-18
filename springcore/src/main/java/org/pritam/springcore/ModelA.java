package org.pritam.springcore;

public class ModelA{
	
	private int x;
	private ModelB modelB;
	
	public ModelA() {
		System.out.println("This is ModelA().");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		System.out.println("This is setX().");
		this.x = x;
	}

	public ModelB getModelB() {
		return modelB;
	}

	public void setModelB(ModelB modelB) {
		System.out.println("This is setModelB().");
		this.modelB = modelB;
	}

	@Override
	public String toString() {
		return "ModelA [x=" + x + ", modelB=" + modelB + "]";
	}
}
