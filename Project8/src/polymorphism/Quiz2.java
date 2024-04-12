package polymorphism;

public class Quiz2 {

	public static void main(String[] args) {
		
		AllMember(new 회원("김석준", "일반", 10000, 10));
		AllMember(new GOLD회원("김석중","GOLD",10000,20,10));
		AllMember(new VIP회원("김석주준","VIP",10000,30,50));
		
	}
	
	public static void AllMember(회원 member) {
		member.show();
	}
}

class 회원{
	String 이름;
	String 등급;
	int 구입가격;
	int 보너스포인트;
	int 보너스포인트적립률;
	
	public 회원(String 이름, String 등급,int 구입가격,int 보너스포인트적립률) {
		this.이름 = 이름;
		this.등급 = 등급;
		this.구입가격 = 구입가격;
		this.보너스포인트 = 구입가격*보너스포인트적립률/100;
	}
	public void show() {
		System.out.println("이름: " + 이름);
		System.out.println("등급: " + 등급);
		System.out.println("구입가격 :" + 구입가격);
		System.out.println("보너스포인트: " + 보너스포인트 + "포인트");
	}
}

class GOLD회원 extends 회원{
	int 할인률;
	public GOLD회원(String 이름, String 등급, int 구입가격, int 보너스포인트적립률, int 할인률) {
		super(이름, 등급, 구입가격, 보너스포인트적립률);
		this.구입가격 = 구입가격-(구입가격*할인률/100);
	}
}

class VIP회원 extends GOLD회원{

	public VIP회원(String 이름, String 등급, int 구입가격, int 보너스포인트적립률, int 할인률) {
		super(이름, 등급, 구입가격, 보너스포인트적립률, 할인률);
	}
	
}
