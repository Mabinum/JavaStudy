package method;

public class Quiz1 {

	public static void 사칙연산(int n1, int n2) {
		int 더하기 = n1 + n2;
		int 빼기 = n1 - n2;
		int 곱하기 = n1 * n2;
		int 나누기 = n1 / n2;
		int 나머지 = n1 % n2;
		
		System.out.println("더하기 : " + 더하기);
		System.out.println("빼기 : " + 빼기);
		System.out.println("곱하기 : " + 곱하기);
		System.out.println("나누기 : " + 나누기);
		System.out.println("나머지 : " + 나머지);
		
	}
	
	public static void main(String[] args) {
			사칙연산(10, 5);
	}

}










