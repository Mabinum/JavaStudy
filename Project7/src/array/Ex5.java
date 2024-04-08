package array;

import java.util.Arrays;

public class Ex5 {

	public static void main(String[] args) {

		int arr[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		for(int value : arr) {
			System.out.println(value);
		}
		
		for(int i = 0; i<10; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
