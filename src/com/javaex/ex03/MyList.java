package com.javaex.ex03;

import java.util.Arrays;

public class MyList<T> {

	private T[] oArr;
	private int crtPos;

	public MyList() {
		oArr = (T[]) new Object[3];
		crtPos = 0;
	}

	public void add(T obj) {
		this.oArr[crtPos] = obj;
		crtPos++;// 순차적으로 +1씩 추가
	}

	public T get(int index) {
		return oArr[index];
	}

	public int size() {
		return crtPos;
	}

}
