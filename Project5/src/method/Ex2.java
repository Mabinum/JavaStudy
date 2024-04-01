package method;

public class Ex2 {

	public static int add(int n1,int n2) {
		int result = n1 + n2;
		return result; //결과값 반환
	}
	
	
	public static void main(String[] args) {

			int num1 = 3;
			int num2 = 5;
			int sum = add(num1,num2);
			
			System.out.println(num1 + " + " + num2 + " = " + sum);
	}

}
