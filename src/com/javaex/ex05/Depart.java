package com.javaex.ex05;

public class Depart extends Employee {
	String bu;
	
	public Depart (String name, int salary, String bu) {
		super(name, salary);
		this.bu=bu;
	}
	
	
	@Override
	 public void showInformation() {
	        System.out.println("이름:" + name + "연봉:" + salary +"부서: " + bu);
	    }

	 //코드작성

}
