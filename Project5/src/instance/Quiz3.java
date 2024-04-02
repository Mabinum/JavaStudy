package instance;

public class Quiz3 {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		
		book1.제목 = "자바프로그래밍";
		book1.가격 = 20000;
		book1.출판사 = "한빛컴퍼니";
		book1.페이지수 = 300;
		
		book1.showBookInfo();

		Book book2 = new Book();
		
		book2.제목 = "스프링";
		book2.가격 = 15000;
		book2.출판사 = "한빛컴퍼니";
		book2.페이지수 = 500;
		
		book2.showBookInfo();
	}

}
