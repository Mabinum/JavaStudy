package arraylist;

import java.util.ArrayList;

public class Ex4_1 {

	public static void main(String[] args) {

		Student2 student1 = new Student2("둘리");
		student1.subjectList.add(new Subject2("국어", 100));
		student1.subjectList.add(new Subject2("수학", 90));
		student1.showInfo();

		Student2 student2 = new Student2("도우너");
		student2.subjectList.add(new Subject2("한문", 50));
		student2.subjectList.add(new Subject2("영어", 70));
		student2.showInfo();
		
		Student1 student = new Student1("둘리");
		student.subjectList.add(new Subject("국어", 100));
		student.subjectList.add(new Subject("국어", 100));
		student.subjectList.add(new Subject("국어", 100));
		student.showInfo();
	}

}

class Subject2 {
	String 과목;
	int 점수;
	public Subject2(String 과목, int 점수) {
		super();
		this.과목 = 과목;
		this.점수 = 점수;
	}
}

class Student2 { 
	String 이름;
	int 총점;
	ArrayList<Subject2> subjectList;
	
	public Student2(String 이름) {
		this.이름 = 이름;
		subjectList = new ArrayList<Subject2>();
		총점 = 0;
	}
	
	public void showInfo() {
		for(int i = 0; i<subjectList.size(); i++) {
			Subject2 sub = subjectList.get(i);
			총점 += sub.점수;
		}
		System.out.println(이름 + "의 총점은 " + 총점 + "입니다");
	}
	
	
	
}