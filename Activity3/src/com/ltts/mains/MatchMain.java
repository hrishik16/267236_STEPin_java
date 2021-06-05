package com.ltts.mains;

import java.util.Scanner;

import com.ltts.matches.ODIMatch;
import com.ltts.matches.T20Match;
import com.ltts.matches.TestMatch;

public class MatchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ODIMatch o = new ODIMatch();
		T20Match tt = new T20Match();
		TestMatch t = new TestMatch();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Match format:\n1.ODI \n2.T20 \n3.Test ");
		int n = sc.nextInt();
		System.out.println("Enter the Current Score:");
		int k = sc.nextInt();
		//o.setCurrentscore(k);
		System.out.println("\nEnter the current Over:");
		float f=sc.nextFloat();
		///o.setCurrentover(f);
		System.out.println("\nEnter the Target score: ");
		int target = sc.nextInt();
		//o.setTarget(target);
		//o.display();
		
		switch(n) {
		case 1: 
			
			o.setCurrentscore(k);
			
			o.setCurrentover(f);
			
			o.setTarget(target);
			o.display();
			break;
		case 2:
			
			tt.setCurrentscore(k);
			
			tt.setCurrentover(f);
			
			tt.setTarget(target);
			tt.display();
			break;
		case 3:
			t.setCurrentscore(k);
			
			t.setCurrentover(f);
			
			t.setTarget(target);
			t.display();
			break;
		default:
			System.out.println("Invalid Input!!!");
			break;
			
		}

	}

}
