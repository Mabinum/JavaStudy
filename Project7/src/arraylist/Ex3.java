package arraylist;

import java.util.ArrayList;

public class Ex3 {

	public static void main(String[] args) {
		
		ArrayList<Book> list = new ArrayList<Book>();
		
		Book book1 = new Book("태백산맥", "조정래");
		list.add(book1);
		
		list.add(new Book("데미안", "헤르만 헤세"));
		list.add(new Book("어떻게 살 것인가", "유시민"));
		
		for(Book book : list) {
			book.showInfo();
		}
		
		for(int i = 0; i < list.size(); i++) {
			Book book = list.get(i);
			book.showInfo();
		}
		
	}

}

class Book { 
	String 제목;
	String 저자;
	public Book(String 제목, String 저자) {
		super();
		this.제목 = 제목;
		this.저자 = 저자;
	}
	
	public void showInfo(){
		System.out.println( 제목 + " " + 저자);
	}
}