package test;

import java.util.Iterator;

class Array{
	public static void main(String[] args){

		int height = Integer.parseInt(args[0]);
		int width = Integer.parseInt(args[1]);
		int area;
		
		area = height * width / 2;
		
		System.out.println("HEIGHT= " + height);
		System.out.println("width= " + width);
		
		System.out.println("menseki " + area);
		
	}
}
