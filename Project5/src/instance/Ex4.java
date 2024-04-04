//package instance;
//
//import javax.security.auth.Subject;
//
//public class Ex4 {
//
//	public static void main(String[] args) {
//		
//		Subject math = new Subject("수학",85);
//		
//		Subject korean = new Subject("국어",100);
//		
//		Subject student = new Student(1001, "둘리", math , korean);
//		
//	}
//
//}
//
//class Student {
//	
//	int studentID; 
//	
//	String studentName;
//	
//	Subject math;
//	
//	Subject korean;
//	
//	public Student (int studentID, String studentName, Subject math, Subject korean)
//	this.studentID = studentID;
//	this.studentName = studentName;
//	this.math = math;
//}