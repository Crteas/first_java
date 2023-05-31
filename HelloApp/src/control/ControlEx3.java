package control;

public class ControlEx3 {
	public static void main(String[] args) {
		int MONTH = 4;
		String title = "========== "+MONTH+"월 달력 =========";
		System.out.println(title);
		String days = "Sun Mon Tue Wed Thr Fri Sat";
		System.out.println(days);
		System.out.println("===========================");
		//4월5월6월중 하나로만 하기
		int push = getFirstDate(MONTH);
		int lastDate = getLastDate(MONTH);
		for (int day = 0; day < push; day++) {
			System.out.printf("%4s", "");
		}
		for (int day = 1; day <= lastDate; day++) {
			System.out.printf("%3d ", day);
			if (day % 7 == 7-push) {
				System.out.println("");
			}
		}
	}

	// 4월은 토요일 5월은 월요일 6월은 목요일
	// 4,5,6월달 달력 switch~case;
	public static int getFirstDate(int month) {
		switch (month) {
		case 4:
			return 6;
		case 5:
			return 1;
		case 6:
			return 4;
		default:
			return 0;
		}
	}

	// 4,5,6월달 달력 switch~case
	public static int getLastDate(int month) {
		if(month%2==0) {
			if(month == 2) {
				return 28;				
			}
			return 30;
		} else {
			return 31;
		}
	}

	public static void method2() {
		for (int num2 = 2; num2 <= 5; num2++) {
			int num1 = num2;
			for (int num = 1; num <= 9; num++) {
				System.out.printf("%d * %d = %d \n", num1, num, (num * num1));
			}
		}

	}

	public static void method1() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				System.out.printf("i의 값은 %d\n", i);
			} else {
				System.out.println("짝수입니다.");
			}
		}

	}
}
