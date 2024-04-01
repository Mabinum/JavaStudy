package object;

public class Student {

	// TODO Auto-generated method stub
	
	int studentID = 1001; //학번
	String studentName = "둘리";
	int grade = 3; //학년
	String address = "인천 남동구"; //주소
			
	//학생의 기능을 메소드로 선언
	public void goSchool() {
		System.out.println("학교에 간다");
	}
	
	public void study() {
		System.out.println("공부를 한다");
	}

}
