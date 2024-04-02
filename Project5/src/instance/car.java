package instance;

public class car {
	
	boolean 현재상태; 
	
//	현재상태를 변경하는 메소드 선언
	public void setStatus(boolean stt) {
		현재상태 = stt;
	}
	
//	현재상태를 출력하는 메소드 선언
	public void showStatus() {
		System.out.println(현재상태);
	}
	
//	
//	public void showCar() {
//		if (현재상태 = true) {
//			System.out.println("달리는 상태입니다.");
//		} else { 
//			System.out.println("멈춘 상태입니다.");
//		}
//	}
}
