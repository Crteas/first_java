package reference;

import java.util.Scanner;

public class ReferenceEx8 {
	public static void main(String[] args) {
		// 학생수 => 점수 입력. 점수출력. 최고점수, 평균점수.

		Scanner scn = new Scanner(System.in);
		int studentNum = 0; // 학생수를 정하겠읍니다.
		int[] scores = null; // 학생들 점수를 담겠읍니다.
		boolean run = true; // while반복을 위한 불값을 선언하겠읍니다.

		while (run) {
			System.out.println("--------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석(최고,평균) 5.끝내기");
			System.out.println("--------------------");
			System.out.print("선택> ");

			try {
				int selectNo = Integer.parseInt(scn.nextLine());
				if (selectNo == 1) {
					System.out.print("학생수> ");
					studentNum = Integer.parseInt(scn.nextLine());
				} else if (selectNo == 2) {
					if(studentNum != 0) {
						scores = new int[studentNum];
						for (int i = 0; i < studentNum; i++) {
							System.out.printf("score[%d]>", i);
							scores[i] = Integer.parseInt(scn.nextLine());
						}						
					} else {
						System.out.println("학생수를 먼저 입력해주세요.");
					}

				} else if (selectNo == 3) {
					if(studentNum !=0) {
						for (int i = 0; i < studentNum; i++) {
							System.out.printf("score[%d]> %d\n", i, scores[i]);
						}						
					} else {
						System.out.println("점수가 없습니다.");
					}
				} else if (selectNo == 4) {
					if (scores == null) {
						System.out.println("점수가 없습니다.");
						continue;
					} 
						int maxValue = scores[0];
						int sum = 0;
						double avg = 0;
						for (int i = 0; i < studentNum; i++) {
							if (maxValue < scores[i]) {
								maxValue = scores[i];
							}
							sum += scores[i];
						
						avg = sum / studentNum;
						System.out.println("최고점수: " + maxValue);
						System.out.println("평균점수: " + avg);
					}
				} else if (selectNo == 5) {
					break;
				}
			} catch (Exception e) {
				System.out.println("오류가 발생했습니다."+e.getLocalizedMessage());
			}
		} // while의 끝
		System.out.println("end of prog."); // 프로그램이 끝났읍니다.

	} // end of main().
}
