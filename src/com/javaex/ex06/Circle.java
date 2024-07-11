package com.javaex.ex06;

public class Circle {

	private int r;

	public Circle() {

	}

	public Circle(int r) {

		this.r = r;
	}

	public final int getR() {
		return r;
	}

	public final void setR(int r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}


}
