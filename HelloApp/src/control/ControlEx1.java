package control;

public class ControlEx1 {
	public static void main(String[] args) {
		int result = (int) (Math.random() * 10);
		System.out.println(result);
		if(result%2 == 0 ) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		//Math.random 을 활용해서 10~100까지의 임의의 수.
		//생성된 값이 100 ~ 90 A
		/*
		 * 80~89 B
		 * 70~79 C
		 * 그 외 D출력
		 */
		
		for(int i = 0; i<1000; i++) {
			int score = (int)(Math.random() * 91)+10;
			String msg = "";
			if(score >=90) {
				msg = "A";
			} else if(score >=80) {
				msg = "B";
			} else if(score >=70) {
				msg = "C";
			} else {
				msg = "D";
			}
			
			System.out.println(score+"점"+msg);

			
			
		}
	}
}
