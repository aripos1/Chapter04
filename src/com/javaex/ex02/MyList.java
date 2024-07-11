package com.javaex.ex02;

import java.util.Arrays;

public class MyList {

	private Object[] oArr;
	private int crtPos;

	public MyList() {
		oArr = new Object[3];
		crtPos = 0;
	}

	public final Object[] getoArr() {
		return oArr;
	}

	public final void setoArr(Object[] oArr) {
		this.oArr = oArr;
	}

	@Override
	public String toString() {
		return "MyList [oArr=" + Arrays.toString(oArr) + "]";
	}

	public void add(Object obj) {
		this.oArr[crtPos] = obj;
		crtPos++;// 순차적으로 +1씩 추가
	}

	public Object get(int index) {
		return oArr[index];
	}

	public int size() {
		return crtPos;
	}



}
