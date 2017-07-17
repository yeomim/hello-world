import java.util.Scanner;

public class Cal {
	
	public static void main (String[] args)
	{
		
		while(true){
		System.out.println("첫번째 계산값을 입력하세요:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		System.out.println("+,-,*,/ 원하는 연산은 선택하세요");
		String cal = scanner.next();
		
		
		System.out.println("두번째 계산값을 입력하세요:");
		int num1 = scanner.nextInt();
		
		int result;
		if("+".equals(cal)){
		  result =num+num1;
		  System.out.println(result);
		}else if("-".equals(cal)){
			result=num-num1;
			System.out.println(result);
		}else if("*".equals(cal)){
			result=num*num1;
			System.out.println(result);
			
		}else if("/".equals(cal)){
			result=num/num1;
			System.out.println(result);
		}else if("quit".equals(cal)){
			break;
		}
	}
	}
}
