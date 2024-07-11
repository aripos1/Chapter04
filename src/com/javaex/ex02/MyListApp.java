package com.javaex.ex02;

public class MyListApp {

	public static void main(String[] args) {

		MyList pList = new MyList();

		Point p01 = new Point(2, 2);
		Point p02 = new Point(3, 3);
		Point p03 = new Point(4, 4);

		pList.add(p01);
		pList.add(p02);
		pList.add(p03);

		Point p = (Point) pList.get(1);
		System.out.println(p.toString());
		/////////////////////////////////

		MyList cList = new MyList();

		Circle c01 = new Circle(5);
		Circle c02 = new Circle(10);
		Circle c03 = new Circle(100);

		cList.add(c01);
		cList.add(c02);
		cList.add(c03);

		Circle c = (Circle) cList.get(0);
		System.out.println(c.toString());
		System.out.println(cList.size());

	}

}
