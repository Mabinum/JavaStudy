package hiding;

public class Quiz2 {

	/*
	 * 자동차(Car)을 정의하는 클래스를 만드세요.
	 * 속성: 제조사, 모델명, 색, 최고속도
	 * 기능: 각 멤버변수의 getter와 setter
	 * 
	 * 자동차 클래스를 사용하여 다음 정보를 가지는 인스턴스를 생성하세요.
	 * 이때, 자동차의정보는 setter를 사용해서 변경하세요.
	 * (현대, 소나타, 흰색, 200)
	 * 자동차의 정보를 출력하세요.
	 * 이때, 자동차의 정보는 getter를 사용해서 출력하세요.
	 * */
	
	public static void main(String[] args) {

		Car car = new Car();
		
		car.set제조사("현대");
		car.set모델명("소나타");
		car.set색("흰색");
		car.set최고속도(200);
		
		System.out.println("제조사는 " + car.get제조사());
		System.out.println("모델명은 " + car.get모델명());
		System.out.println("색은 " + car.get색());
		System.out.println("최고속도는 " + car.get최고속도());
		
	}

}

class Car {
	String 제조사;
	String 모델명;
	String 색;
	int 최고속도;
	
	public String get제조사() {
		return 제조사;
	}
	public void set제조사(String 제조사) {
		this.제조사 = 제조사;
	}
	public String get모델명() {
		return 모델명;
	}
	public void set모델명(String 모델명) {
		this.모델명 = 모델명;
	}
	public String get색() {
		return 색;
	}
	public void set색(String 색) {
		this.색 = 색;
	}
	public int get최고속도() {
		return 최고속도;
	}
	public void set최고속도(int 최고속도) {
		this.최고속도 = 최고속도;
	}
	
	
	
}