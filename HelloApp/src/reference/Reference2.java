package reference;

public class Reference2 {
	public static void main(String[] arges) {
		int[] intAry = {10,20,30};
		String[] strAry = {"A","P","S","E"};
		int sum = intAry[0]+ intAry[1]+ intAry[2];
		sum = 0;
		for (int i = 0; i<3;i++) {
			sum +=intAry[i];
		};
		for (String str : strAry) {
			System.out.println(str);
		}
		System.out.println(sum);
	}
}
