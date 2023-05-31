package control;

public class ControlEx4 {
	// 1부터 100까지의 수중에서 3의 배수의 합계. method1()
	// Math.random() 의 2번 실행 => 두수의 합이 5가 되는경우.
	// 1/4,2/3,3/2, 반복회수를 중단. method2()
	// 반복문 for를 활용.
	// *
	// **
	// ***
	// ****
	public static void main(String[] args) {
//		method1();
//		method2();
//		method3();
		method4();
	}
	
	public static void method1() {
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			if(i%3 == 0) {
				sum = sum + i;				
			}
		}
		System.out.println(sum);
	} //end of method1
	
	public static void method2() {
		while(true) {
			int num1 = (int) (Math.random() * 5)+1;
			int num2 = (int) (Math.random()*5)+1;
			System.out.printf("%d,%d \n",num1,num2);
			if(num1 + num2 == 5) {
				break;
			}
		}
	} //end of method2
	
	public static void method3() {
//		for(int i =1;i<5;i++) {
//			System.out.println("*".repeat(i));
//		}
		
		for(int i = 1 ; i<5 ; i++) {
			for(int j =0; j<i;j++) {
				System.out.printf("*");
			}
			System.out.println("");
		}
	}//end of method3
	
	public static void method4() {
		for(int i=1;i<5;i++) {
			for(int k =0;k<4-i;k++) {
				System.out.printf(" ");
			}
			for(int j =0; j<i;j++) {
				System.out.printf("*");
			}
			System.out.println("");
		}
	}
	
}
