package reference;

public class ReferenceEx7 {
	public static void main(String[] args) {
		double[][] heightAry = {
				{21.5,12.3,11.1, 9.9}, // a반
				{34825.5,31232.3,51531.1,61232.7}, //b반
				{1234.5,1682.3,5243.2,7222.2,998.1}, //c반
				{531235.22378,235982.48264,456123.95175,85462.37915} //d반
				
		};
		System.out.println(heightAry[1].length);
		String fmt = "%d번째반 평균 키 %.4f \n";
		for(int k = 0; k<heightAry.length;k++) {
			double sum = 0;
			for(int i = 0; i<heightAry[k].length;i++) {
				sum = sum + heightAry[k][i];
			}
			System.out.printf(fmt,k+1,sum/heightAry[k].length);
		}
	}
}
