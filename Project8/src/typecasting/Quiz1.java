package typecasting;

public class Quiz1 {

	public static void main(String[] args) {

		부모 parents = new 자식("한국","김","석준");
		자식 children = new 자식("미국","Sam","Joon");
		
		children.show();
		
	
		
	}

}

class 부모{
	String 국적;
	String 성;
	public 부모(String 국적, String 성) {
		super();
		this.국적 = 국적;
		this.성 = 성;
	}
}


class 자식 extends 부모{
	String 이름;
	
	public 자식(String 국적, String 성, String 이름) {
		super(국적, 성);
		this.이름 = 이름;
	}

	public void show() {
		System.out.println("국적 : " + 국적 + " 성 : " + 성 + " 이름 : " + 이름 );
	}
}
