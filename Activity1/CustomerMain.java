package com.ltts;

import java.util.Scanner;

class Customer{
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
public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Enter the Details");
		s=sc.next();
		String[] str=s.split(",");
		c.setName(str[0]);
		c.setAddress(str[1]);
		c.setMobile(str[2]);
		System.out.println("\nName: "+c.getName()+ "\nAddress: "+c.getAddress()+"\nMobile:"+c.getMobile());

	}

}
