package operator;

import java.util.Scanner;

public class OperatorEx2 {
	public static void firstMethod() {
		// Sanncer 사용해서 입력값을 2개.
		// 3, 4 => 3의 4제곱에 값을 출력.
		// ex)5, 6 => 5^6
		Scanner scn = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		try {
			System.out.println("첫번째 숫자를 입력해주세요");
			num1 = scn.nextInt();
			System.out.println("두번째 숫자를 입력해주세요");
			num2 = scn.nextInt();
			result = num1;
			for (int i = 1; i < num2; i++) {
				result = result * num1;
			}
			;
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("메롱");
		}
		scn.close();
	}

	public static void secondMethod() {
		// scanner 활용.
		// "I am a boy",6 => 문장을 입력받은 숫자의 횟수만큼 반복출력.
		Scanner scan = new Scanner(System.in);
		String str = "";
		int repeat = 0;
		try {
			System.out.println("문장을 입력해주세요");
			str = scan.nextLine();
			System.out.println("얼마나 반복할건가?");
			repeat = scan.nextInt();

			for (int i = 0; i < repeat; i++) {
				System.out.println(str);
			}
		} catch (Exception e) {
			System.out.println("메롱");
		}
		scan.close();
	} // end of secondMethod

	public static void thirdMethod(int num1,int num2) {
		System.out.println(num1+num2);
	}
	
	public static void main(String[] args) {
//		firstMethod();
//		secondMethod();
		Scanner scn = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		try {
			System.out.println("첫번째 숫자를 입력해주세요.");
			num1 = scn.nextInt();
			System.out.println("두번째 숫자를 입력해주세여.");
			num2 = scn.nextInt();
			thirdMethod(num1,num2);			
		}catch(Exception e) {
			
		}
		
		scn.close();
	}
}
