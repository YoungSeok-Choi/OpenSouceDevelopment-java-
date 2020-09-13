package my.packages;

import java.util.Scanner;

public class Week2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner My_Scan = new Scanner(System.in);
	      
	     double a, b, result;
	     String str;
	     System.out.print("연산>>");
	     a = My_Scan.nextDouble();
	     str = My_Scan.next();
	     b = My_Scan.nextDouble();
	      
	     // if-else문 이용한 연산식 구분
	     if(str.equals("+")) {
	        result = a + b;
	        System.out.print(a+str+b+"의 계산 결과는 "+result);
	     }
	     else if(str.equals("-")) {
	        result = a - b;
	        System.out.print(a+str+b+"의 계산 결과는 "+result);
	     }
	     else if(str.equals("*")) {
	        result = a * b;
	        System.out.print(a+str+b+"의 계산 결과는 "+result);
	     }
	     else if(str.equals("/")) {
	        if(b==0) {
	           System.out.print("0으로 나눌 수 없습니다.");
	        }
	        else {
	           result = a / b;
	           System.out.print(a+str+b+"의 계산 결과는 "+result);
	        }  
	     }
	     else
	    	 System.out.println("올바른 연산자를 입력하세요.");
	     
	     My_Scan.close();	
	}

}
