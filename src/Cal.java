import java.util.Scanner;

public class Cal {
	
	public static void main (String[] args)
	{
		
		while(true){
		System.out.println("ù��° ��갪�� �Է��ϼ���:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		System.out.println("+,-,*,/ ���ϴ� ������ �����ϼ���");
		String cal = scanner.next();
		
		
		System.out.println("�ι�° ��갪�� �Է��ϼ���:");
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
