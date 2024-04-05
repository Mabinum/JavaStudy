package object;

public class Quiz3 {

	public static void main(String[] args) {
		손님 둘리 = new 손님("둘리",10000);
		손님 또치 = new 손님("또치",20000);
		
		메뉴 라떼 = new 메뉴("라떼",4500);
		메뉴 아메리카노 = new 메뉴("아메리카노",4000);
		
		별다방 cafe1 = new 별다방(둘리,아메리카노);
		별다방 cafe2 = new 별다방(또치,라떼);
		cafe1.show();
		cafe2.show();
		
	}

}

class 손님{
	String 이름;
	int 소지금;
	public 손님(String 이름, int 소지금) {
		super();
		this.이름 = 이름;
		this.소지금 = 소지금;
	}
	
}

class 별다방{
	손님 정보;
	메뉴 커피;
	
	public 별다방(손님 이름, 메뉴 커피) {
		super();
		this.정보 = 이름;
		this.커피 = 커피;
	}

	public void show() {
		if(커피.이름 == "라떼") {
			if(정보.소지금<커피.값) {
				System.out.println("커피를 살 수 없는 돈입니다.");
			} else { 
				System.out.println(정보.이름 + "가 라떼를 구입 했습니다");
			}
		}
		
		if(커피.이름 == "아메리카노") {
			if(정보.소지금<커피.값) {
				System.out.println("커피를 살 수 없는 돈입니다.");
			} else { 
				System.out.println(정보.이름 + "가 아메리카노를 구입 했습니다");
			}			
		}
	}
}

class 메뉴{
	String 이름;
	int 값;
	
	public 메뉴(String 이름, int 값) {
		super();
		this.이름 = 이름;
		this.값 = 값;
	}
}