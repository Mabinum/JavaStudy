package downcasting;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add(new 사람());
		list.add(new 호랑이());
		list.add(new 독수리());
		
		for(int i = 0; i<list.size(); i++) {
			
		}
		
	}

}
class String{
	
}

class 사람 extends String{
	public void readBook() {
		System.out.println("사람이 책을 읽고 있습니다.");
	}
}
class 호랑이 extends String{
	public void hunting() {
		System.out.println("호랑이가 사냥중입니다.");
	}
}
class 독수리 extends String{
	public void flying() {
		System.out.println("독수리가 납니다");
	}
}
