package com.iesvirgendelcarmen.com.exercises;

public class Triangle {
	
	public static int numberOfTriangle = 0;
	
	private float sideA;
	private float sideB;
	private float sideC;
	
	public Triangle(float sideA, float sideB, float sideC) throws IlegalTriangleException {
		if (checkTriangle(sideA, sideB, sideC)) {
			this.sideA = sideA;
			this.sideB = sideB;
			this.sideC = sideC;
			numberOfTriangle++;
		}
		else
			throw new IlegalTriangleException("Bad triangle");
	}
	
	private boolean checkTriangle(float sideA, float sideB, float sideC) {
		// TODO Auto-generated method stub
		return ( sideA + sideB > sideC && sideB + sideC > sideA
				&& sideA + sideC > sideB);
	}
	public float getSideA() {
		return sideA;
	}
	public void setSideA(float sideA) {
		this.sideA = sideA;
	}
	public float getSideB() {
		return sideB;
	}
	public void setSideB(float sideB) {
		this.sideB = sideB;
	}
	public float getSideC() {
		return sideC;
	}
	public void setSideC(float sideC) {
		this.sideC = sideC;
	}
	@Override
	public String toString() {
		return "Triangle [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]";
	}


}
