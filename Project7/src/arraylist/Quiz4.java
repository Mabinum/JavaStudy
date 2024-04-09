package arraylist;

import java.util.ArrayList;

public class Quiz4 {

	public static void main(String[] args) {

			ArrayList<Student> list = new ArrayList<Student>();
			Student student1 = new Student(2019,"김석준");
			Student student2 = new Student(2020,"김성준");
			Student student3 = new Student(2021,"김석중");
			student1.show();
			student2.show();
			student3.show();
			list.add(student1);
			list.add(student2);
			list.add(student3);
			for(int i = 0; i<list.size(); i++) {
				Student stu = list.get(i);
				stu.show();
			}
	}
}

class Student{
	int 학번;
	String 이름;
	public Student(int 학번, String 이름) {
		super();
		this.학번 = 학번;
		this.이름 = 이름;
	}
	public void show() {
		System.out.println("학번은 : " + 학번 + "이며 이름은 : " + 이름 + "입니다." );
	}
}
