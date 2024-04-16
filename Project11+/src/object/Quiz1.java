package object;

public class Quiz1 {

	public static void main(String[] args) {

		MyDate data1 = new MyDate(2024, 4, 16);
		MyDate data2 = new MyDate(2024, 4, 17);
		
		if( data1 == data2) {
			System.out.println("주소가 같음");
		} else {
			System.out.println("주소가 다름");
		}
		
		if(data1.equals(data2)) {
			System.out.println("값이 같음");
		} else {
			System.out.println("값이 다름");
		}
	}

}

class MyDate{
	int 연;
	int 월;
	int 일;
	
	public MyDate(int 연, int 월, int 일) {
		super();
		this.연 = 연;
		this.월 = 월;
		this.일 = 일;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate data = (MyDate)obj;
			if(this.연 == data.연 && this.월 == data.월 && this.일 == data.일) {
				return true;
			}
		}
		return super.equals(obj);
	}
	
	
	
	
}


