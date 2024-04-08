package array;

/*
 * 5개 크기의 정수형 배열을 생성하고, 1~10 중 짝수만 저장하세요.
 * 답: 2 4 6 8 10
 * */
public class Quiz4 {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%2 == 0 ) {
				System.out.println(arr[i]);
			}
		}
	}

}
