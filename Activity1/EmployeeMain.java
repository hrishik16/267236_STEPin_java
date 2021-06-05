package com.ltts;

import java.util.Scanner;

class Employee{
	private String name;
	private String address;
	private String mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		String n;
		System.out.println("Enter The Name");
		n=sc.next();
		e.setName(n);
		System.out.println("Enter The Address");
		n=sc.next();
		e.setAddress(n);
		System.out.println("Enter The Mobile");
		n=sc.next();
		e.setMobile(n);
		System.out.println("Employee Details:\n"+"Name: "+ e.getName()+"\nAddress: "+e.getAddress()+"\nMobile: "+e.getMobile());
		boolean x=false;
		int k=0;
		do {
			System.out.println("Menu\n1.Update Employee Name\n2.Update Employee Address\n3.Update Employee Mobile\n4.All Information Correct");
			k=sc.nextInt();
			switch(k) {
			case 1: 
				x=true;
				System.out.println("Current Name is:"+e.getName());
				System.out.println("\nEnter New Name :");
				n=sc.next();
				e.setName(n);
				break;
			case 2:
				x=true;
				System.out.println("\nCurrent Address is:"+e.getAddress());
				System.out.println("\nEnter New Address:");
				n=sc.next();
				e.setAddress(n);
				break;
			case 3:
				x=true;
				System.out.println("\nCurrent Mobile No:"+e.getMobile());
				System.out.println("\nEnter New Mobile:");
				n=sc.next();
				e.setMobile(n);
				break;
			case 4:
				x=true;
				System.out.println("Employee Details:\n"+"Name: "+ e.getName()+"\nAddress: "+e.getAddress()+"\nMobile: "+e.getMobile());
				break;
			default:
				x=false;
				System.out.println("Invalid Input");
				break;
				
		
			}
		}while(x==true);

		//System.out.println(e.getName());
		

	}

}
