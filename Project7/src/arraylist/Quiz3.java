package arraylist;

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		list.add("EE");
		
		for(int i = 0; i<list.size(); i++) {
			String string = new String();
			string = list.get(i);
			System.out.print(string + " ");
		}
		
//		list.remove(0);
//		list.remove(0);
//		list.remove(0);
//		list.remove(0);
//		list.remove(0);
		
		for(int i = 0; i<5; i++) {
			list.remove(0);
		}
		
		System.out.println(list);
	}

}
