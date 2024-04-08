package array;
/*
 * 5개 크기의 정수형 배열을 생성하세요.
 * 값의 목록을 다음과 같이 초기화하세요 {5, 20, 100, 30, 77}
 * 배열에서 가장 큰값을 찾으세요.
 * 
 * 답: 100
 * */
public class Quiz5 {

	public static void main(String[] args) {

		int[] arr = new int[] {5,20,100,30,77};
		int arrs = 0;
		for ( int i = 0; i<arr.length; i++) {
			if(arrs<arr[i]) {
				arrs = arr[i];
			}
		}
		System.out.println(arrs);
		
	}

}
