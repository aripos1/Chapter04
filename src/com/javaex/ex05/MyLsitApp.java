package com.javaex.ex05;

import java.util.ArrayList;

public class MyLsitApp {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(3);
		intList.add(6);
		intList.add(9);
		
		System.out.println(intList.toString());
		System.out.println(intList.size());
		
		intList.remove(0);
		System.out.println(intList.toString());
		System.out.println(intList.size());
		
		System.out.println(intList.get(1));
	}

}
