package com.javaex.ex08;

import java.util.HashSet;

public class Point {
	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {

	}

	public Point(int x, int y) {

		this.x = x;
		this.y = y;
	}

	// 매서드 gs
	public final int getX() {
		return x;
	}

	public final void setX(int x) {
		this.x = x;
	}

	public final int getY() {
		return y;
	}

	public final void setY(int y) {
		this.y = y;
	}

	// 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public int hashCode() {
		int result = x + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		Point p = (Point) obj;
		if (this.x == p.x && this.y == p.y) {
			return true;
		} else {
			return false;
		}

	}

}
