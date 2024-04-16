package main;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
		System.out.println("드라이버 선택");
		System.out.println("1: MyDB");
		System.out.println("2: OraDB");
		System.out.println("3: PostDB");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); //문자를 입력 받아서 num변수에 저장
		DB db = null;
		
		if(num == 1) {
			db = new MyDB();
		} else if(num == 2) {
			db = new OraDB();
		} else if(num == 3) {
			db = new PostDB();
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		if(db != null) {
			db.connect();
		}
		
		
	}

}

class MyDB implements DB{

	@Override
	public void connect() {
		System.out.println("MyDB에 연결");
	}
	
}
class  OraDB implements DB{

	@Override
	public void connect() {
		System.out.println("OraDB에 연결");
	}
	
}
class PostDB implements DB{

	@Override
	public void connect() {
		System.out.println("PostDB에 연결");
	}
	
}
