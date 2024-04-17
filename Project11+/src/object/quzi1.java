package object;

import java.util.Scanner;

public class quzi1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println(str);
		while(str == "END") {
			System.out.println("끝!");
		}
//		while(!(str == "END" || str == "end")) {
//			if(str == "END" || str == "end") {
//				System.out.println("끝!");
//				return;
//			}
//			str = scanner.nextLine();
//		}
	}

}
