package control;

public class ControlEx2 {
	public static void main(String[] args) {
		//12월
		//메소드 마지막 날짜값: 1-> 31, 2->28 3->31 4->30
		int MONTH = 3;
		System.out.println(MONTH+"월달의 마지막날은 "+getLastDate(MONTH));
	}
	
	public static int getLastDate(int month) {
		switch(month) {
		case 1,3,5,7,9,11:
			return 31;
		case 4,6,8,10,12:
			return 30;
		case 2:
			return 28;
		default:
			return 0;
		} 
//		if(month >= 13) {
//			return 0;
//		}
//		if(month%2 == 0) {
//			if(month == 2) {
//				return 28;
//			}
//			return 30;
//		} else {
//			return 31;
//		}
	}
	
	public static void method1() {
		int result = (int) (Math.random()*3)+1;
		switch (result) {
		case 1:
			System.out.println("가위.");
			break;
		case 2:
			System.out.println("바위.");
			break;
		case 3:
			System.out.println("보.");
			break;
		default:
			System.out.println("아니 이게 모야");
		}
		System.out.println("end of prog.");
		
	}
}
