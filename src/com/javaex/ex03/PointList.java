package com.javaex.ex03;

public class PointList {

	//필드
	private Point[] pArr;
	private int crtPos;

	//생성자
	public PointList() {
		// TODO Auto-generated constructor stub
		//메모리 올리고 추가적으로 해야되는 일
		pArr = new Point[3];
		crtPos = 0; // 처음 값을 0으로 세팅
	}

	
	//gs
	
	//메소드 일반
	//현재 배열 몇개?
	//현재 배열 +1 새로 만들고
	//이전 배열에 있는 값을 현재 배열로 이동
	//현재 배열 마지막에 point 추가


	public void add(Point point){
		this.pArr[crtPos] = point;
		crtPos++;// 순차적으로 +1씩 추가
	}
	
	public Point get(int index) {
		return pArr[index];
	}
	
	public int size() {
		return crtPos;
	}
	
}
