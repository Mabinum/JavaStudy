package arraylist;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		
		list.add(1,40);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		int num1 = list.get(0);
		int num2 = list.get(1);
		int num3 = list.get(2);
		
	}

}
