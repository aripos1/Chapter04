package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex02 {

	public static void main(String[] args) {

		Set<Integer> iSet = new TreeSet<Integer>();

		while (true) {
			if (iSet.size() == 6) {
				break;
			}
			int no = (int)(Math.random() * 45) + 1;
			iSet.add(no);
			System.out.println(no);
		}
		System.out.println("-------------");
		for (int no : iSet) {
			
			System.out.println(no);
		}
	}
}
