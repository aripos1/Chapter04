package com.javaex.ex04;

import java.util.ArrayList;

public class MyListApp {

	public static void main(String[] args) {

		ArrayList<Point> pList = new ArrayList<Point>();

		Point p01 = new Point(2,2);
		Point p02 = new Point(12,12);
		Point p03 = new Point(22,22);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		System.out.println(pList.size());
	}
}
