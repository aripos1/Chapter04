package com.javaex.ex04;

import java.util.ArrayList;

public class MyListApp {

	public static void main(String[] args) {

		ArrayList<Point> pList = new ArrayList<Point>();
		// ArrayList[] pList = new ArrayList[3]
		Point p01 = new Point(2, 4);
		Point p02 = new Point(12, 14);
		Point p03 = new Point(22, 24);

		pList.add(p01);
		pList.add(p02);
		pList.add(p03);

		System.out.println(pList.size());
		System.out.println("==================");

		Point p = pList.get(1);
		System.out.println(p.getY());
		Point p2 = pList.get(2);
		System.out.println(p2.toString());
		System.out.println("==================");

		for (int i = 0; i < pList.size(); i++) {
			Point pp = pList.get(i);
			System.out.println(pp);
		}
		System.out.println("==================");

		pList.remove(1);
		for (int i = 0; i < pList.size(); i++) {
			Point pp = pList.get(i);
			System.out.println(pp);

			System.out.println(pList.toString());
		}
	}
}
