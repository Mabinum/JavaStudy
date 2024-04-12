package override;
/*
 * 커피,아메리카노,카페라떼 클래스를 정의하세요.
 * 커피클래스에서 상속받은 메소드를 재정의하세요 taste()
 * */
public class Quiz2 {

	public static void main(String[] args) {
		COFFEE ame = new Americano();
		COFFEE latte = new Latte();
		
		
		ame.taste();
		latte.taste();
		
	}

}

class COFFEE {
	public void taste() {
		System.out.println("맛입니다.");
	}
}

class Americano extends COFFEE{

	@Override
	public void taste() {
		System.out.println("아메리카노 맛입니다.");
	}
	
}
class Latte extends COFFEE {

	@Override
	public void taste() {
		System.out.println("라떼 맛입니다.");
	}
	
}
