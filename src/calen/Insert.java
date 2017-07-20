package calen;

import java.util.Scanner;

public class Insert {
	public static void main(String[] args){
//	System.out.println("더할 값 두수를 입력하세요");
	Scanner scanner = new Scanner(System.in);
//	int first = scanner.nextInt();
//	int second = scanner.nextInt();
	
	
//	System.out.println("두 수의 합계는?"+(first+second));
	
	
	System.out.println("출력할 문자는?");
	Scanner scanner2 = new Scanner(System.in);


	
	String a,b;
	a = scanner2.next();
	b = scanner2.next();
	System.out.println("입력한 문제열은"+a+b+ "입니다");
	int s,s2;
	s =Integer.parseInt(a);
	s2 =Integer.parseInt(b);
	int view = s+s2;
//	System.out.println("입력한 문제열은"+view+ "입니다");
	
	System.out.printf("%d와 %d의두 수의 합은 %d입니다",a,b,view);
	scanner2.close();
	}

}
