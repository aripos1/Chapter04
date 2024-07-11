package com.javaex.ex01;

public class MyListApp {

	public static void main(String[] args) {
		/*
		 * //배열로 관리 //미리 갯수를 결정해야됨 - 장점은 속도가 빠름, 단점은 미리 갯수를 결정하기 때문에 공간 낭비 Point[] pArr
		 * = new Point[3];
		 * 
		 * Point p01 = new Point(2,2); Point p02 = new Point(3,3); Point p03 = new
		 * Point(4,4);
		 * 
		 * pArr[0] = p01; pArr[1] = p02; pArr[2] = p03;
		 * 
		 * 
		 * for(int i= 0; i<pArr.length; i++) { System.out.println(pArr[i].toString());
		 * 
		 * }
		 */

		PointList pList = new PointList();

		Point p01 = new Point(2, 2);
		Point p02 = new Point(3, 3);
		Point p03 = new Point(4, 4);

		pList.add(p01);
		pList.add(p02);
		pList.add(p03);

		Point p = pList.get(1);
		System.out.println(p.toString());

		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		// 원관리
		CircleList cList = new CircleList();

		Circle c01 = new Circle(5);
		Circle c02 = new Circle(10);
		Circle c03 = new Circle(100);

		cList.add(c01);
		cList.add(c02);
		cList.add(c03);

		Circle c = cList.get(0);
		System.out.println(c.toString());
		System.out.println(cList.size());

		for (int i = 0; i < cList.size(); i++) {
			System.out.println(cList.get(i).toString());
		}
	}

}
