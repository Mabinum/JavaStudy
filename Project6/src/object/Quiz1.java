package object;
/* 
 * 학생이 대중교통을 타고 학교에 가는 상황을 구현하세요.
 * 
 * 학생 두 명을 생성하세요. (둘리,5000)(도우너,10000)
 * 둘리는 100번버스를 타고 학교에 갑니다.
 * 도우너는 2호선 지하철을 타고 학교에 갑니다.
 * 학생,버스,지하철의 현재 정보를 출력하세요.
 * */
public class Quiz1 {

	public static void main(String[] args) {
		Student1 student1 = new Student1("둘리",5000);
		Student1 student2 = new Student1("도우너",10000);
		Bus1 bus1 = new Bus1(100,student1);
		Bus1 bus2 = new Bus1(100,student2);
		bus1.showBusInfo();
		System.out.println();
		bus2.showBusInfo();
	}

}

class Student1 {
	String 이름;
	int 돈;
	public Student1(String 이름, int 돈) {
		super();
		this.이름 = 이름;
		this.돈 = 돈;
	}
}

class Bus1 { 
	int 버스넘버;
	Student1 student1;
	Student1 student2;
	public Bus1(int 버스넘버, Student1 student) {
		super();
		this.버스넘버 = 버스넘버;
		student1 = student;
	}
	
	public void showBusInfo() {
		System.out.println("버스" + 버스넘버 + "를 타고 학생 " + student1.이름 + "가 " + student1.돈 + "원을 들고 등교를 합니다.");
	}
}
class Subway1 { 
	String 몇호선;
	Student1 student1;
	Student1 student2;
	public Subway1(String 몇호선, Student1 student) {
		super();
		this.몇호선 = 몇호선;
		student1 = student;
	}
	
	
}
