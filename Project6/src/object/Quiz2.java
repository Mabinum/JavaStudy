package object;

public class Quiz2 {

	public static void main(String[] args) {
		학생 student1 = new 학생("둘리",100000);
		Taxi taxi = new Taxi(student1);
		taxi.비용(student1);
	}

}
class 학생{
	String 이름;
	int 값;
	public 학생(String 이름, int 값) {
		super();
		this.이름 = 이름;
		this.값 = 값;
	}
	
}

class Taxi {
	
	학생 student1;
	
	public Taxi(학생 student1) {
		super();
		this.student1 = student1;
	}




	public void 비용(학생 student1){
		if(student1.값<10000) {
			System.out.println("만원보다 적기에 택시에 탈 수 없습니다");
		} else {
			System.out.println("어디로 모실까요? " + student1.이름 + " 고객님");
		}
	}
}