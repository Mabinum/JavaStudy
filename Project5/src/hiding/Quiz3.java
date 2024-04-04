package hiding;

/*
 * Mydate 클래스의 setMonth 메소드에 다음과 같이 조건을 추가하세요.
 * 1~12월이 들어오면 값을 변경하고, 
 * 그외의 값이 들어오면 "잘못된 월입니다" 메세지를 출력합니다.
 * */

public class Quiz3 {

	
	public static void main(String[] args) {
		
		Mydate mydate1 = new Mydate();
		
		mydate1.setMonth(1);
		System.out.println(mydate1.getMonth() + "월 입니다.");
	}
}

class Mydate {
	int month;
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month<1 || month >12) {
			System.out.println("잘못된 월입니다.");
			return;
		}
		this.month = month;
	}
	
}
