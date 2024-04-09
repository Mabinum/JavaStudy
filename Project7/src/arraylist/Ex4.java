package arraylist;

import java.util.ArrayList;

public class Ex4 {
	public static void main(String[] args) {
	
		Student1 student1 = new Student1("둘리");
		student1.subjectList.add(new Subject("국어", 100));
		student1.subjectList.add(new Subject("수학", 90));
		student1.showInfo();

		Student1 student2 = new Student1("도우너");
		student2.subjectList.add(new Subject("한문", 50));
		student2.subjectList.add(new Subject("영어", 70));
		student2.showInfo();
	}

}

class Subject{
	String 과목명;
	int 점수;
	public Subject(String 과목명, int 점수) {
		super();
		this.과목명 = 과목명;
		this.점수 = 점수;
	}
}

class Student1 {
	String 학생이름;
	ArrayList<Subject> subjectList; //수강과목 목록을 저장할 리스트 선언
	int total;
	public Student1(String 학생이름) {
		this.학생이름 = 학생이름;
		subjectList = new ArrayList<Subject>(); //리스트 생성
		total = 0;
	}
	
	public void showInfo() {
		for(int i = 0; i<subjectList.size(); i++) {
			Subject sub = subjectList.get(i);
			total += sub.점수;
		}
		System.out.println(학생이름 + "학생의 총점은 " + total + "입니다.");
	}
	
	
}





