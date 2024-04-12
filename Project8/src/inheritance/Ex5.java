package inheritance;

public class Ex5 {

	public static void main(String[] args) {

		Monster monster = new Monster();
		슬라임 slime = new 슬라임();
		
		monster.공격력 = 10;
		monster.체력 = 100;
		slime.공격력 = 30;
		slime.체력 = 200;
		slime.스킬 = "마비";
		
		monster.공격();
		slime.공격();
		slime.스킬시전();
		
	}
}

class Monster {
	int 공격력;
	int 체력;
	public void 공격() {
		System.out.println("몬스터의 공격력은 " + 공격력 + "이고 체력은 " + 체력 + "이다");
		System.out.println("몬스터가 " + 공격력 + "만큼 공격했다!");
	}
}

class 슬라임 extends Monster{
	String 스킬;
	public void 스킬시전() {
		System.out.println("슬라임이 "+ 스킬 + "을 시전했다!");
	}
}