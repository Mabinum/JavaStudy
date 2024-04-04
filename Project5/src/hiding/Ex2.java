package hiding;

public class Ex2 {

	public static void main(String[] args) {

		MyDate2 date = new MyDate2(); //달력 생성
		// date.day = 30; //private변수는 외부에서 직접 사용할 수 없음
		date.setMonth(2);
		date.setDay(30); //검증 실패하여 저장되지 않음
		date.setDay(10); //10일 저장 성공
		System.out.println("현재 날짜는 " + date.getMonth() + "월 " + date.getDay() + "일 입니다");
		
	}
}

class MyDate2 {
	private int month; //월
	private int day; //일
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getDay() {
		return day;
	}
	
	//새로 들어온 값이 올바른 일자인지 확인하고 저장한다
	public void setDay(int day) {
		//month가 2월 일때, 새로운 일자가 1~28일이라면 저장
		if(month == 2) {
			
			if(day < 1 || day > 28) {
				System.out.println("2월에는 " + day + " 일이 없습니다" );
				return;
			}
		}
		
		this.day = day;
	}
	
	
}
