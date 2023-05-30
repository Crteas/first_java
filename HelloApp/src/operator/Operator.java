package operator;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		// 메소드: 객체(object)에 소속되어있는 함수.
		
		/*
		 * 사용자의 값을 입력받도록 num1, num2 값을 입력받도록.
		 * num1 ~ num2 사이의 값의 합계를 구하는 프로그램 작성.
		 * 짝수만 계산합.
		 * 
		 */ 
		Scanner scn = new Scanner(System.in);
		int result = 0;
		
		int a,b;
		try {
			System.out.println("첫번째 숫자를 입력하세요.");
			a = scn.nextInt();
			System.out.println("두번째 숫자를 입력하세요.");
			b = scn.nextInt();
			if(a<b) {
				for ( int i = a; i<=b;i++) {
					if(i%2 == 0) {
						result = result + i;						
					}
				}				
			} else {
				for ( int i = a; i>=b;i--) {
					if(i%2 == 0) {
						result = result + i;		
					}
				}			
			}
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
		}
		
		System.out.println("결과값은"+result+"입니다.");
		scn.close();
		
	}

}
