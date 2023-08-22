package com.functional.interfaces;


public class Main{
	 public static void main(String[] args) {
		Addable add=(a,b)->(a+b);
		int res=add.add(2, 4);
		System.out.println(res);
		
		Shape rect=()->System.out.println("its rectacle");
		rect.draw();
	}
}