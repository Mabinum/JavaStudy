package loop;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		break를 사용하여 1부터 20까지 더하다가,
//		합이 100이 넘어가면 반복문을 중단한다
//		for문이 종료되기전 i과 sum의 값을 출력한다.
		
		int sum = 0;
		int i ;
		
		for(i = 1; i<=20; i++) {
			sum = sum + i;
			System.out.println("i: " + i + " , sum: " + sum);
			
			if(sum >= 100) {
				break;
			}
		}
	}

}
