package downcasting;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {

		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new 학생("김석준"));
		list.add(new 회사원("김석중"));
		
		for(int i = 0; i<list.size(); i++) {
			
		}
		
	}

}

class Person{
	String 이름;
	
	public Person(String 이름) {
		super();
		this.이름 = 이름;
	}
	
	public void 밥먹는다() {
		System.out.println(이름 + "가 밥을 먹는다");
	}
}

class 학생 extends Person{
	
	public 학생(String 이름) {
		super(이름);
	}

	public void 공부() {
		System.out.println(이름+"이 공부를 한다.");
	}
}

class 회사원 extends Person{
	
	public 회사원(String 이름) {
		super(이름);
	}
	
	public void 일() {
		System.out.println(이름+"이 일을 한다.");
	}
}
