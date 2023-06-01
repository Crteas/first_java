package reference;

public class ReferenceEx4 {
	public static void main(String[] args) {
		String[] strAry = {"김치볶음밥","참치김밥","연어초밥"};
		strAry[0] = "Hong";
		System.out.println(strAry[0]);
		
		strAry = new String[] {"Hong", "kim","choi"};
		
		for (String str : strAry) {
			System.out.println(str);
		}
		
		for (int i = 0; i<strAry.length;i++) {
//			System.out.println(strAry[i]);
			if(strAry[i].equals("kim")) {
				System.out.printf("%s 은 %d 번째에 있습니다.",strAry[i],i+1);
			}
		}
		
		String s1 = "Hongkildong";
		char result = s1.charAt(4);
		System.out.println(result);
		
		int result1 = s1.indexOf("k");
		System.out.println(result1);
		
		String[] idAry = {"950304-1234567","950404-2234567"};
		for (int i = 0; i < idAry.length; i++) {
			if(idAry[i].charAt(7) == '1') {
				System.out.println(i+1+" : "+"참치김밥");
			}else if(idAry[i].charAt(7) == '2') {
				System.out.println(i+1+" : "+"떡볶이");
			}
		}
	}
}
