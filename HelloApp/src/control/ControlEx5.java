package control;

public class ControlEx5 {
	public static void main(String[] args) {
		// while, do while
		boolean isTrue = true;
		int sum = 0;
		int count = 0;
		
		do {
			System.out.println("do print");
			int result = (int) ((Math.random()*6)+1);
			sum += result;
			if(sum>100)
				isTrue = false;
			count++;
		} while (isTrue);
		System.out.println(count);
		System.out.println(sum);
		System.out.println("평균: "+ (sum/ (float)count));
//		while(isTrue) {
//			System.out.println("print");
//		}
		
		System.out.println("end of prog.");
	}
}
