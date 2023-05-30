package operator;

import java.util.Scanner;

public class OperatorEx3 {
	public static void main(String[] args) {
//		method1();
		// 변수 balance 선언.
		// balance가 100,000 범위내에서.
		// 입력값을 판단 balance 값 추가 2)balance 값을 빼기.
		// 현재 balance 값을 콘솔출 력 4)종 료.
		Scanner scn = new Scanner(System.in);
		int balance = 0;
		try {
			
			while (true) {
				System.out.println("1)추가 2)차감 3)balance 출력 4)종료");
				int menu = scn.nextInt();
				
				if(menu == 4) {
					System.out.println("종료합니다.");
					break;
				} else if(menu == 1) {
					int num1 = 0;
					System.out.println("얼마더할래.");
					num1 = scn.nextInt();
					if(balance + num1 <= 100000) {						
						balance = balance + num1;
					}else if(num1<0) {
						System.out.println("0위로 입력하셔야합니다요");
					}else {
						System.out.println("10만을 초과한 숫자는 입력할 수 없습니다. 입력한 값 : "+num1);
					}
				} else if(menu == 2) {
					int num1 = 0;
					System.out.println("얼마뺄래.");
					num1 = scn.nextInt();
					if(num1 <= 100000) {
						balance = balance - num1;						
					}else if(num1>0) {
						System.out.println("0위로 입력하셔야합니다요");
					} else {
						System.out.println("10만을 초과한 숫자는 입력할 수 없습니다. 입력한 값 : "+num1);
					}
				} else if(menu == 3) {
					System.out.println("현재 balance값은 "+balance+ "입니다.\n");
				} else if(menu == 5) {
					int num1 = 0;
				}
				else {
					System.out.println("뭐눌렀길래 이게뜸");
				}
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("end of prog");
	}

	public static void method1() {
		// 반복처리. while (condition){}
		int num1 = 1;
//		while(num1<=10) {
////			System.out.println(num1++);
//		}
		boolean isOK = false;
		isOK = true;
		num1 = 1;
		while (isOK) {
//			if(num1 >= 10) {
//				isOK = false;
//			}
			Scanner scn = new Scanner(System.in);
			// quit 구문을 입력하면 반복종료
			isOK = true;
			while (isOK) {
				System.out.println("문장을 입력해주세요");
				String str = scn.nextLine();
				if (str.equals("quit")) {
					isOK = false;
				}
				System.out.println(str);
			}
		}
		System.out.println("end of prog.");
	}
}
