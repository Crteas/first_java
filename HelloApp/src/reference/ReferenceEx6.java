package reference;

import java.util.Scanner;

public class ReferenceEx6 {
	public static void main(String[] args) {
		// 학생3명 : 홍길동의 영어, 수학 
		int[][] intAry = {
				new int[] {80,90}, // 홍길동의 영어 수학
				new int[] {85,95}, // 김길동의 영어 수학
				new int[] {83,80} // 박길동의 영어 수학
		};
//		intAry[0] = new int[] {22,23};
//		System.out.println(intAry[0][0]);
		System.out.printf("홍길동의 영어점수 %d \n", intAry[0][0]);
		System.out.printf("김길동의 수학점수 %d \n", intAry[1][1]);
		int engSum = 0;
		int mathSum = 0;
		
		for (int i = 0; i < intAry.length; i++) {
			engSum += intAry[i][0];
		}
		System.out.printf("영어점수의 합계: %d \n",engSum);
		for (int i = 0; i < intAry.length; i++) {
			mathSum += intAry[i][1];
		}
		System.out.printf("수학점수의 합계: %d \n",mathSum);
		
		int totalSum = 0;
		
		for(int j = 0; j<intAry.length; j++) {
			for(int i =0;i<intAry[j].length; i++) {
				totalSum += intAry[j][i];
			}
		}
		System.out.println(totalSum);
		
		String[] nameAry = {"홍길동","김길동","박길동"};
//		System.out.printf("%s 의 영어점수는 %d, 수학점수는 %d",nameAry[0],intAry[0][0],intAry[0][1]);
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.printf("학생번호를 입력해주세요 :  ");
			int input = scan.nextInt() -1;
			if(input < nameAry.length && input >= 0) {
				System.out.printf("%d번 학생) %s 의 영어점수는 %d, 수학점수는 %d \n",
						input+1,nameAry[input],intAry[input][0],intAry[input][1]);
//				for(int i = 0; i<nameAry.length;i++) {
//			}			
			} else {
				System.out.println("그런학생은 없는데요");
			}
			if(input+1 == 99) {
				break;
			}
		} //end of while(true)
		
	}// end of main.
}
