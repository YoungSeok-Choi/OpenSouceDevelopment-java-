package my.packages;

import java.util.Scanner;

public class Week2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner My_Scan = new Scanner(System.in);
	      
	     double a, b, result;
	     String str;
	     System.out.print("����>>");
	     a = My_Scan.nextDouble();
	     str = My_Scan.next();
	     b = My_Scan.nextDouble();
		
		 // switch�� �̿��� ����� ����
	     switch(str) {
	     case "+" :
	        result = a+b;
	        System.out.print(a+str+b+"�� ��� ����� "+result);
	        break;
	     case "-":
	        result = a-b;
	        System.out.print(a+str+b+"�� ��� ����� "+result);
	        break;
	     case "*":
	        result = a*b;
	        System.out.print(a+str+b+"�� ��� ����� "+result);
	        break;
	     case "/":
	        if(b==0) {
	           System.out.print("0���� ���� �� �����ϴ�.");
	           break;
	        }
	        else {
	           result = a / b;
	           System.out.print(a+str+b+"�� ��� ����� "+result);
	           break;
	        }
	     default:
	        System.out.print("�߸� �Է��Ͽ����ϴ�.");
	     }
	     My_Scan.close();
	}

}
