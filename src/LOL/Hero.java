//面向对象练习作业
package LOL;

public class Hero {
	String name;
	int hp;
	int armor;
	int moveSpeed;
	int regain(int blood) {
		hp = hp+blood;
//		System.out.println(name+"当前血量:"+hp);
		return hp;
	}
	int getArmor() {
//		System.out.println("护甲值："+armor);
		return armor;
	}
	int addSpeed(int speed) {
		moveSpeed = moveSpeed + speed;
//		System.out.println("增加移动速度:"+moveSpeed);
		return moveSpeed;
	}
	void lengdry() {
		System.out.println("超神了！");
	}
	public static void main(String[] args) {
		Hero gairen = new Hero();
		gairen.name = "盖伦";
		gairen.hp = 300;
		gairen.armor = 1000;
		gairen.moveSpeed = 555;
		System.out.println(gairen.name+"血量"+gairen.hp);
		System.out.println(gairen.name+"恢复血量");
		gairen.regain(100);
		System.out.println(gairen.name+"当前血量:"+gairen.hp);
		gairen.getArmor();
		System.out.println(gairen.name+"当前护甲："+gairen.armor);
		System.out.println(gairen.name+"当前移动速度"+gairen.moveSpeed);
		gairen.addSpeed(600);
		System.out.println("增加后的移动速度："+gairen.moveSpeed);
		gairen.lengdry();
	}

}
