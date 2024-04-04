package thisex;

public class Ex1 {

	public static void main(String[] args) {

		BirthDay bi = new BirthDay();
		
		bi.setYear(2000);
		System.out.println(bi);
		bi.printThis();
		
	}

}

class BirthDay {
	int  year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
	
	
}