package reference;

import java.util.Scanner;

class Student1{
	String name;
	int engScore;
	int mathScore;
}

public class ReferenceEx9 {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.name = "김밥";
		s1.engScore = 90;
		s1.mathScore = 80;
		Student1 s2 = new Student1();
		s2.name = "카레";
		s2.mathScore = 20;
		s2.engScore =10;
		Student1 s3 = new Student1();
		s3.name = "멸치볶음";
		s3.engScore = 40;
		s3.mathScore = 50;
		Student1[] students = {s1,s2,s3};
		Scanner scn = new Scanner(System.in);
		String sName = scn.nextLine();
		for(int i = 0; i < students.length; i++) {
			if(students[i].name.equals(sName)) {
				System.out.println(students[i].name);
				System.out.println(students[i].engScore);
				System.out.println(students[i].mathScore);
				System.out.println("========================");
			}
		}
	}
}
