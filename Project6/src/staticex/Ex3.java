package staticex;

public class Ex3 {

	public static void main(String[] args) {

		System.out.println(10 * 10 * Calculator.pi);
		
		System.out.println(Calculator.puls(10,5));
		
		System.out.println(Calculator.minus(10,5));
		
	}

}

class Calculator {
	static double pi = 3.14159; //원의 둘레를 구하는 파이는 공통속성
	
	static int puls(int x , int y) {
		return x + y;
	}
	static int minus(int x , int y) {
		return x - y;
	}
	
}
