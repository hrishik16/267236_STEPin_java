package com.ltts;

import java.util.Scanner;

class Company{
	private String name;
	private String employees;
	private String teamlead;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployees() {
		return employees;
	}
	public void setEmployees(String employees) {
		this.employees = employees;
	}
	public String getTeamlead() {
		return teamlead;
	}
	public void setTeamlead(String teamlead) {
		this.teamlead = teamlead;
	}
	
}
public class CompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c = new Company();
		Scanner sc=new Scanner(System.in);
		String n,e,t;
		boolean x=false;
		System.out.println("\nEnter Name of Company");
		n=sc.next();
		c.setName(n);
		System.out.println("\nEnter names of Employees");
		e=sc.next();
		String[] str=e.split(",");
		c.setEmployees(e);
		System.out.println("\nEnter the Team Lead");
		t=sc.next();
		c.setTeamlead(t);
		for (String a:str) {
			
			if(a.equals(t)) {
				x=true;
				break;
			}
			
		}
		
		if(x) {
			System.out.println("\nName:"+c.getName()+"\nEmployees:"+c.getEmployees());
			System.out.println("\nTeam Lead:"+c.getTeamlead());
		}
		else
			System.out.println("Invalid Input");
				
		

	}

}
