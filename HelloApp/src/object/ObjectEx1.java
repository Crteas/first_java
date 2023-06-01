package object;

import java.util.Scanner;

class Member{
	String memberId;
	String memberName;
	int point;
}

public class ObjectEx1 {
	public static void main(String[] agrs) {
		Scanner scn = new Scanner(System.in);
		
		
		Member[] members = new Member[3];
		for(int i = 0;i < members.length; i++) {
			Member m1 = new Member();
			
			while(true) {
				boolean isExist = false;
				System.out.print("아이디를 입력>");
				m1.memberId = scn.nextLine();
				if(i != 0) {
					for(int j = 0; j<i;j++) {
						if(m1.memberId.equals(members[j].memberId) ) {
							isExist = true;
							System.out.println("아이디가 이미 존재합니다.");						
							break;
						}
					}
				} 
				if(!isExist) {
					break;
				}
			}
			System.out.print("이름을 입력>");
			m1.memberName = scn.nextLine();
			System.out.print("point를 입력>");
			m1.point = Integer.parseInt(scn.nextLine());
			members[i] = m1;
		}
		
		String search = scn.nextLine();
		int changePoint = Integer.parseInt(scn.nextLine());
		
		for(int i =0;i<members.length;i++) {
			if(members[i].memberId.equals(search)) {
				members[i].point = changePoint;
			}
		}
		System.out.println(members[0].memberName);
		
		scn.close();
	}
}
