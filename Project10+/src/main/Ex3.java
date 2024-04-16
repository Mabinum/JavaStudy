package main;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		newcalculator tor = new newcalculator();
		calc tor = new newcalculator(); 
		System.out.println(tor.add(1, 10));
	}

}

class newcalculator implements calc{

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int times(int num1, int num2) {
		if(num2>0) {
			return num1 * num2;			
		} else {
			return calc.ERROR;
		}
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2>0) {
			return num1 / num2;			
		} else {
			return calc.ERROR;
		}
	}
}
