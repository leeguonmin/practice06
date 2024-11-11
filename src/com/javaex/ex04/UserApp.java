package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
	
		
		int[][] two = new int[3][4];
		
		int sum = 0; 
		for (int row = 0; row < table.length; ++row) { 	// 행 루프
			for (int col = 0; col < table[row].length; ++col) {	// 열루프
				int val = table[row][col];
				
				System.out.print(val + "\t");
				sum += val; 		// 내부 cell 데이터 합산
			}
		
		
		
		
//		Customer t = new Customer("Jws", "J1234", "정우성", 1000);
//		t.show();
//		
//		Customer e = new Customer("yis", "y23445", "이효리", 9587);
//		e.show();
//		
//		Employee r = new Employee("master", "m7894", "운영자", 5000);
//		r.show();

	}

}
		

// 배열로 방 3개  만들어서, 유저의 배열 3개짜리를 만들고 
// 방마다 회원들 정도를 넣어 / 루프 돌아 / 