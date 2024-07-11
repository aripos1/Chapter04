package com.javaex.ex06;

import java.util.LinkedList;
import java.util.List;

public class MyListApp {

	public static void main(String[] args) {

		List<Circle> cList = new LinkedList<Circle>();

		Circle r01 = new Circle(5);
		Circle r02 = new Circle(15);
		Circle r03 = new Circle(100);

		cList.add(r01);
		cList.add(r02);
		cList.add(r03);
		
		System.out.println(cList);
		System.out.println(cList.size());
		System.out.println("================");
		
		cList.remove(2);
		
		System.out.println(cList);
		System.out.println(cList.size());
		
		for(int i=0;i<cList.size(); i++) {
			System.out.println(cList.get(i).getR());
		}
	}
}