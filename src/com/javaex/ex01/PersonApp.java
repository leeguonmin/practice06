package com.javaex.ex01;

public class PersonApp {

	public static void main(String[] args) {
		
		Person r = new Person("정우성", "010-1111-2222");
		r.showInfo();
		
		Customer n = new Customer("유재석", "010-2222-3333", 1, 1000);
		n.showInfo();

	}

}

//		Person p = new Person("정우성", "010-1111-2222");
//		Customer s = new Customer("유재석", "010-2222-3333", 1, 1000);
//		
//		p.showInfo();
//		s.showInfo();
		
//	}
//
//}

