package reference;

public class ReferenceEx5 {
	public static void main(String[] args) {
		int a = (int)(Math.random()*100);
		int b = (int)(Math.random()*100);
		int c = (int)(Math.random()*100);
		
		int[] intAry;
		
		
		int[] numAry = { 0, 0, 0 };

		for (int i = 0; i < numAry.length; i++) {
			if (a > b) {
				if (a > c) {
					numAry[i] = a;
					a = Integer.MIN_VALUE;
				} else {
					numAry[i] = c;
					c = Integer.MIN_VALUE;
				}
			} else {
				if (b > c) {
					numAry[i] = b;
					b = Integer.MIN_VALUE;
				} else {
					numAry[i] = c;
					c = Integer.MIN_VALUE;
				}
			}
		} //end for
		
		
		for(int num : numAry) {
			System.out.println(num);
		}
		
		int[] intAry2 = new int[5];
		
		for(int j = 0; j<intAry2.length - 1; j++) {
			for(int i = 0; i <intAry2.length;i++) {
				int temp = 0;
			}
		}
	}
}
