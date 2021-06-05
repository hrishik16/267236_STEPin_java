package com.ltts.mains;

import java.util.Scanner;

import com.ltts.shapes.Circle;
import com.ltts.shapes.Square;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		Square s = new Square();
		System.out.println("\n1.Circle\n2.Square");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("\nEnter the Radius of Circle:");
			int r = sc.nextInt();
			c.calculateArea(r);
			break;
		case 2:
			System.out.println("\nEnter the Side of Square:");
			int k = sc.nextInt();
			s.calculateArea(k);
			break;
		default: 
			System.out.println("\nInvalid Input");
			break;
		}
		

	}

}
