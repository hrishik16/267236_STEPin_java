package com.ltts;

import java.util.Scanner;

class Innings{
	private String teamname;
	private String inningsname;
	private int runs;
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getInningsname() {
		return inningsname;
	}
	public void setInningsname(String inningsname) {
		this.inningsname = inningsname;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public void displayInningsDetails(String s,int r) {
		if(s.equals("first")) {
			r=r+1;
			System.out.println("\nNeed "+ r+" runs to Win\n");
		}
		else {
			//System.out.println(s);
			System.out.println("Match Ended");
		}
	}
	
}
public class InningsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Innings i=new Innings();
		Scanner sc = new Scanner(System.in);
		String n,s;
		int r;
		System.out.println("\nEnter the Team Name:");
		n=sc.next();
		i.setTeamname(n);
		System.out.println("\nEnter the Session:");
		s=sc.next();
		i.setInningsname(s);
		System.out.println("\nEnter the runs");
		r=sc.nextInt();
		i.setRuns(r);
		System.out.println("\nName: "+ i.getTeamname()+"\nScored:"+i.getRuns());
		i.displayInningsDetails(s, r);
		

	}

}
