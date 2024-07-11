package com.javaex.ex03;

public class Circle {

	private int circle;

	public Circle() {

	}

	public Circle(int i) {
		// TODO Auto-generated constructor stub
	}

	public final int getCircle() {
		return circle;
	}

	public final void setCircle(int circle) {
		this.circle = circle;
	}

	@Override
	public String toString() {
		return "Circle [circle=" + circle + "]";
	}

}
