package operator;

import java.io.IOException;

public class OperatorEx4 {
	public static void main(String[] args) {
		boolean ok = true;
		String msg = "";
		while(ok) {
			System.out.println("값을 입력하세요.");
			try {
				int result = System.in.read();
				System.in.read();System.in.read();
				if(result == 113) {
					ok = false;
				}
				if(result >= 97 && result <= 122) {
					msg = "소문자입니다.";
				} else if (result >= 65 && result <= 96) {
					msg = "대문자입니다.";
				} else if (result >= 48 && result <= 57) {
					msg = "숫자입니다.";
				} else {
					msg = "그 외";
					System.out.println(result);
				}
				System.out.println(msg);	
			} catch(IOException e){
				e.printStackTrace();
			}			
		}
		System.out.println("끝.");
	}
}
