package object;

public class Ex1 {

	public static void main(String[] args) {

//		Bus bus = new Bus(2);
		
		Student student = new Student("둘리",10000);
		Bus bus = new Bus(100); //100버스를 만든다
		student.takeBus(bus);
		student.showInfo();
		bus.showInfo();
		
		Student student1 = new Student("둘리",10000);
		Subway subway = new Subway("급행"); //100버스를 만든다
		student1.takeSubway(subway);
		student1.showInfo();
		subway.showInfo();
		
		
	}

}


//버스클래스
class Bus { 
	int busNumber; // 버스번호
	int passengerCount; //승객수
	int money; // 수입
	
	public Bus(int busNumber) {
		super();
		this.busNumber = busNumber;
	}
	
	public void take (int money) {
		this.money = this.money + money; //버스 수입 증가
		
		passengerCount++; // 승객수 1명 증가
	}
	
	public void showInfo() {
		System.out.println("버스" + busNumber + "번의 승객은" + passengerCount + "명이고, 수입은" + money + "입니다.");
	}
	
}

//지하철 클래스
class Subway {
	String lineNumber; // 지하철 노선번호
	
	int passengerCount; //승객수
	
	int money; // 수입

	public Subway(String lineNumber) {
		super();
		this.lineNumber = lineNumber;
	}
	public void take (int money) {
		this.money = this.money + money; //버스 수입 증가
		
		passengerCount++; // 승객수 1명 증가
	}
	
	public void showInfo() {
		System.out.println("지하철" + lineNumber + "번의 승객은" + passengerCount + "명이고, 수입은" + money + "입니다.");
	}
	
}

//학생 클래스
class Student {
	String studentName; //학생이름
	
	int money; // 소지금

	public Student(String studentName, int money) {
		super();
		this.studentName = studentName;
		this.money = money;
	}
		
	public void takeBus(Bus bus) {
		bus.take(1000); //1000원 지불
		this.money = this.money - 1000; //가진돈 1000원을 잃음.
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500); //1500원 지불
		this.money = this.money - 1500; //가진돈 1500원을 잃음
	}
	
	public void showInfo(){
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
		
	}
}