package inheritance;

public class Quiz2 {

	public static void main(String[] args) {

		BasicTv basicTv = new BasicTv();
		SmartTv smartTv = new SmartTv();
		
		basicTv.전원상태 = "on";
		basicTv.채널 = 7;
		basicTv.볼륨 = 20;
		
		smartTv.전원상태 = "on";
		smartTv.채널 = 11;
		smartTv.볼륨 = 30;
		smartTv.아이피 = "192.168.0.111";
		
		basicTv.show();
		smartTv.show();
		
		
	}

}

class BasicTv { 
	String 전원상태;
	int 채널;
	int 볼륨;
	
	public void show() {
		System.out.println("전원 상태 : " + 전원상태 + " 채널은 " + 채널 + " 볼륨은 " + 볼륨 + "입니다");
	}
	
}

class SmartTv extends BasicTv{
	String 아이피;	

	public void show() {
		System.out.println("전원 상태 : " + 전원상태 + " 채널은 " + 채널 + " 볼륨은 " + 볼륨 + "입니다 또한 아이피주소는 " + 아이피 + "입니다");		
	}
}


