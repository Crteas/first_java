package object;

import java.util.Scanner;

public class ObjectEx2Bank {
	public static void main(String[] args) {
		Bank[] accounts = new Bank[3];

		boolean run = true;
		int selectNo = 0;
		Scanner scn = new Scanner(System.in);
		int count = 0;

		while (run) {
			System.out.println("1.등록 2.조회 3.입금 4.출금 5.종료");
			System.out.print("선택> ");
			selectNo = Integer.parseInt(scn.nextLine());
			if (selectNo == 1) {
				boolean exist = false;
				if(count >= 3) {
					System.out.println("너무 많이 만듦");
					continue;
				}
				Bank bank = new Bank();
				System.out.print("계좌번호 입력> ");
				String accNo = scn.nextLine();
				for(int i = 0;i<count;i++) {
					if(accounts[i].accountNo.equals(accNo)) {
						System.out.println("같은 계좌가 있다.");
						exist = true;
					}
				}
				if(exist) {
					continue;
				}
				bank.accountNo = accNo;
				System.out.print("이름입력 > ");
				String name = scn.nextLine();
				bank.owner = name;
				bank.balance = 1000;
				
				accounts[count] = bank;
				count++;
				
			} else if (selectNo == 2) {
				for(int i = 0;i<count;i++) {
					System.out.printf("%s님의 계좌번호 %s의 잔액은 %d원 입니다.\n",
							accounts[i].owner,accounts[i].accountNo,accounts[i].balance);
				}
			} else if (selectNo == 3) {
				System.out.println("입금할 계좌를 입력.");
				System.out.print("계좌번호 >");
				String account = scn.nextLine();
				for(int i = 0; i<count;i++) {
					if(accounts[i].accountNo.equals(account)) {
						System.out.println("얼마 입금할래");
						System.out.print("금액 >");
						int money = Integer.parseInt(scn.nextLine());
						accounts[i].balance += money;
					}
				}
			} else if (selectNo == 4) {
				System.out.println("출금할 계좌를 입력.");
				System.out.print("계좌번호 >");
				String account = scn.nextLine();
				for(int i = 0; i<count;i++) {
					if(accounts[i].accountNo.equals(account)) {
						System.out.println("얼마 출금할래");
						System.out.print("금액 >");
						int money = Integer.parseInt(scn.nextLine());
						if(accounts[i].balance < money) {
							System.out.println("양심이 없니");
							continue;
						}
						accounts[i].balance -= money;
					}
				}
			} else if (selectNo == 5) {
				break;
			}
		} // end of while

		System.out.println("end of prog.");
	}// end of main
}
