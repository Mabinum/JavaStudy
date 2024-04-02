package instance;

public class Student {

	int studentID; //학번
	
	String studentName;
	
	int grade;
	
	String address;
	
//	학생의 모든 정보를 보여주는 함수 선언
	public void show() {
		System.out.println("학번" + studentID + " , 이름: " + studentName + ", 학년:" + grade + 
				", 주소:" + address
				);
		
	}
}
