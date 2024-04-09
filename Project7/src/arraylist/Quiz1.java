package arraylist;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {

		ArrayList<Character> list = new ArrayList<Character>();
		list.add('A');
		list.add('B');
		list.add('C');
		
		char ch1 = list.get(0);
		System.out.print(ch1 + " ");
		char ch2 = list.get(1);
		System.out.print(ch2 + " ");
		char ch3 = list.get(2);
		System.out.print(ch3 + " ");
	}

}
