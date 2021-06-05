package com.ltts.matches;

public class TestMatch extends Match {

	@Override
	public float calculateRunRate() {
		// TODO Auto-generated method stub
float rr = (getTarget()-getCurrentscore())/(90-getCurrentover());
		
		return rr;
	}

	@Override
	public int calculateBalls() {
		// TODO Auto-generated method stub
		int b=(int) (540-getCurrentover()*6);
		return b;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		int a=getTarget()-getCurrentscore();
		int c=calculateBalls();
		float f=calculateRunRate();
		System.out.println("Need "+a+" runs in "+ c+" balls");
		System.out.println("Required Run rate:"+ f);
	}

}
