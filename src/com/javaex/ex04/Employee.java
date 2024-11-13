package com.javaex.ex04;

public class Employee extends User {
	// 필드 선언 
	int salary;
	int oll;
	int u;
	
	
	// 생성자
	public Employee(String id, String password, String name, int salary, int oll,int u) {
		super(id,password,name);
		this.salary=salary;
		this.oll=oll;
		this.u=u;
	}
	
	@Override
	public void show() {
		System.out.printf("#아이디:%s, #패스워드:%s, #이름:%s, #월급:%d%n", getId(),password,name,salary);
		System.out.printf("운영자의 월급은 %d원 이빈다.%n",oll);
		System.out.printf("운영자의 연봉은 %d원 입니돠.%n",u);
	}

	
}

