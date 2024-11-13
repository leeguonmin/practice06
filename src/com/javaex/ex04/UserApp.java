package com.javaex.ex04;

// practice05 ex07 FriendApp 참고하자!!!

public class UserApp {

	public static void main(String[] args) {
		
		
		User[] user = new User[4];
		
		user[0] = new Customer("Jws", "J1234", "정우성", 1000);
		user[1]=new Customer("yis", "y23445", "이효리", 9587);
		user[2]=new Employee("master", "m7894", "운영자", 500, 5000000,55);
		user[3]=new Employee("master", "m0101", "알바천국", 900, 900000000,99);
		

		for(int i=0; i<user.length; ++i) {
			;user[i].show();
		}

		
		
		
		
		
	}
}
		
		
		
		
//1. 
//Customer t = new Customer("Jws", "J1234", "정우성", 1000);
//t.show();
//
//Customer e = new Customer("yis", "y23445", "이효리", 9587);
//e.show();
//
//Employee r = new Employee("master", "m7894", "운영자", 5000);
//r.show();

//}
		
		
		

		
		
		
		
		
		//2.
//		int[][] two = new int[3][4];
//		
//		int sum = 0; 
//		for (int row = 0; row < table.length; ++row) { 	// 행 루프
//			for (int col = 0; col < table[row].length; ++col) {	// 열루프
//				int val = table[row][col];
//				
//				System.out.print(val + "\t");
//				sum += val; 		// 내부 cell 데이터 합산
//			}
		
		
	
//
//}
//		

// 배열로 방 3개  만들어서, 유저의 배열 3개짜리를 만들고 
// 방마다 회원들 정도를 넣어 / 루프 돌아 / 

// System.out.println("별도로 출력/합니다.");/
// 별도로 출력할 내용 (운영자의 월급)



/*
// User 타입의 배열 선언 (Customer와 Employee 객체 모두 저장 가능)
User[] users = new User[3];

// 배열에 Customer와 Employee 객체를 추가
users[0] = new Customer("jws", "1234", "정우성", 1000);
users[1] = new Customer("yys", "3455", "이효리", 2000);
users[2] = new Employee("master", "m7788", "운영자", 5000000);

// 반복문을 통해 배열에 있는 객체들의 정보를 출력
for (int i = 0; i < users.length; i++) { 
    users[i].show();  // 각 객체의 show() 메서드를 호출하여 정보 출력
}

System.out.println("운영자의 월급은 " + salary + "원 입니다.");
}

}
*/		