package wa;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String name = "유저";
		int hp = 10;
		int dmg = 5;
		int def = 2;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("1)시작 2)종료");
			int menu = scan.nextInt();
			if(menu == 1) {
//				start
				System.out.println("굳");
				game(name,hp,dmg,def);
			} else {
				break;
			}
		} // start while end
	}
	public static void game(String name, int hp, int dmg, int def) {
		Scanner scan = new Scanner(System.in);
		String userName = name;
		int userHp = hp;
		int userDmg = dmg;
		int userDef = def;
		while(true) {
			System.out.println("1)앞으로 2)정비 3)끝내기");
			int menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("이벤트 발생");
				break;
			case 2:
				System.out.println("체력회복같은거..?");
				break;
			case 3:
				System.out.println("게임끝내기. 세이브없음");
				break;
			default:
				System.out.println("이상한거 입력하면 안되는데?");
			}		
			if(menu == 5) {
				break;
			}
		}
	}
}
