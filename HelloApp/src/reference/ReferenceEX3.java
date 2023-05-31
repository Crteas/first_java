package reference;

public class ReferenceEX3 {
	public static void main(String[] args) {
		//학생점수: 89.5, 78.9, 90.4 값을 저장. sum avg구함.
		double[] scores = {89.5,78.9,90.4};
		double sum = 0;
		double maxValue = scores[0];
		double minValue = scores[0];
		double avg = 0;
		for(int i = 0; i<scores.length; i++) {
			sum = sum + scores[i];
		}
		avg = sum/scores.length;
		for(int i = 0; i<scores.length;i++) {
			if(maxValue < scores[i]) {
				maxValue = scores[i];
			}
			if(minValue > scores[i]) {
				minValue = scores[i];
			}
		}
		
		String fmt = "sum : %.2f, avg : %.2f, maxValue : %.2f, minValue : %.2f";
		
		System.out.printf(fmt,sum,avg,maxValue,minValue);
	}
	
}
