package my.packages;

import java.util.Scanner;

public class Week2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner My_Scan = new Scanner(System.in);
	      
	     double a, b, result;
	     String str;
	     System.out.print("����>>");
	     a = My_Scan.nextDouble();
	     str = My_Scan.next();
	     b = My_Scan.nextDouble();
	      
	     // if-else�� �̿��� ����� ����
	     if(str.equals("+")) {
	        result = a + b;
	        System.out.print(a+str+b+"�� ��� ����� "+result);
	     }
	     else if(str.equals("-")) {
	        result = a - b;
	        System.out.print(a+str+b+"�� ��� ����� "+result);
	     }
	     else if(str.equals("*")) {
	        result = a * b;
	        System.out.print(a+str+b+"�� ��� ����� "+result);
	     }
	     else if(str.equals("/")) {
	        if(b==0) {
	           System.out.print("0���� ���� �� �����ϴ�.");
	        }
	        else {
	           result = a / b;
	           System.out.print(a+str+b+"�� ��� ����� "+result);
	        }  
	     }
	     else
	    	 System.out.println("�ùٸ� �����ڸ� �Է��ϼ���.");
	     
	     My_Scan.close();	
	}

}
