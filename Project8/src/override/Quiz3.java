package override;
/*
 * 컴퓨터,노트북,데스크탑 클래스를 정의하세요.
 * 컴퓨터클래스에서 상속받은 메소드를 재정의하세요 on() off()
 * */
public class Quiz3 {

	public static void main(String[] args) {

		Computer com = new Computer();
		Computer note = new NoteBook();
		Computer desk = new DeskTop();
		
		com.on();
		com.off();
		note.on();
		note.off();
		desk.on();
		desk.off();
		
	}

}
class Computer {
	public void on() {
		System.out.println("컴퓨터를 킵니다.");
	}
	public void off() {
		System.out.println("컴퓨터를 끕니다.");
	}
}

class NoteBook extends Computer{

	@Override
	public void on() {
		System.out.println("노트북을 킵니다.");
	}

	@Override
	public void off() {
		System.out.println("노트북을 끕니다.");
	}
	
}

class DeskTop extends Computer{

	@Override
	public void on() {
		System.out.println("데스크탑을 킵니다.");
	}

	@Override
	public void off() {
		System.out.println("데스크탑을 끕니다.");
	} 
	
}
