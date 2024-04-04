package hiding;

public class Quiz1 {

	public static void main(String[] args) {

		Book book1 = new Book();
		book1.set제목("자바프로그래밍");
		book1.set가격(20000);
		book1.set출판사("한빛컴퍼니");
		book1.set페이지수(300);
		
		System.out.println("제목 " + book1.get제목());
		System.out.println("가격 " + book1.get가격());
		System.out.println("출판사 " + book1.get출판사());
		System.out.println("페이지수 " + book1.get페이지수());
		
		System.out.println();
		
		Book book2 = new Book();
		book2.set제목("스프링");
		book2.set가격(15000);
		book2.set출판사("한빛컴퍼니");
		book2.set페이지수(500);
		
		System.out.println("제목 " + book2.get제목());
		System.out.println("가격 " + book2.get가격());
		System.out.println("출판사 " + book2.get출판사());
		System.out.println("페이지수 " + book2.get페이지수());
	}

}

class Book {
	String 제목;
	int 가격;
	String 출판사;
	int 페이지수;
	
	public String get제목() {
		return 제목;
	}
	public void set제목(String 제목) {
		this.제목 = 제목;
	}
	public int get가격() {
		return 가격;
	}
	public void set가격(int 가격) {
		this.가격 = 가격;
	}
	public String get출판사() {
		return 출판사;
	}
	public void set출판사(String 출판사) {
		this.출판사 = 출판사;
	}
	public int get페이지수() {
		return 페이지수;
	}
	public void set페이지수(int 페이지수) {
		this.페이지수 = 페이지수;
	}
	
}