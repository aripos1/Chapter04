package com.javaex.ex02;

import java.util.Arrays;

public class CircleList {

	private Circle[] cArr;
	private int crtPos;

	public CircleList() {
		cArr = new Circle[3];
		crtPos = 0;

	}

	public final Circle[] getpArr() {
		return cArr;
	}

	public final void setpArr(Circle[] pArr) {
		this.cArr = pArr;
	}

	@Override
	public String toString() {
		return "CircleList [pArr=" + Arrays.toString(cArr) + "]";
	}

	public void add(Circle circle) {
		this.cArr[crtPos] = circle;
		crtPos++;// 순차적으로 +1씩 추가
	}

	public Circle get(int index) {
		return cArr[index];
	}

	public int size() {
		return crtPos;
	}

}
