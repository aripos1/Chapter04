package com.javaex.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {

		Map<String, Point> pMap = new HashMap<String, Point>();

		Point p01 = new Point(2, 4);
		Point p02 = new Point(2, 4);
		Point p03 = new Point(43, 78);

		pMap.put("정웅성", p01);
		pMap.put("이효링", p02);
		pMap.put("박명숙", p03);

		System.out.println(pMap.size());

		System.out.println(pMap.toString());

		System.out.println(pMap.get("박명숙").getX());

		Point p04 = new Point(20, 40);
		pMap.put("박명숙", p04);
		System.out.println(pMap.get("박명숙").getX());
		System.out.println("----------------");

		Set<String> Keys = pMap.keySet();
		for (String k : Keys) {
			System.out.println(pMap.get(k).getX());
		}

	}
}
