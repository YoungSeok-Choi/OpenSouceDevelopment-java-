package my.packages;

import java.util.Scanner;

public class Week2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner My_Scan = new Scanner(System.in);
	      
	     double a, b, result;
	     String str;
	     System.out.print("연산>>");
	     a = My_Scan.nextDouble();
	     str = My_Scan.next();
	     b = My_Scan.nextDouble();
		
		 // switch문 이용한 연산식 구분
	     switch(str) {
	     case "+" :
	        result = a+b;
	        System.out.print(a+str+b+"의 계산 결과는 "+result);
	        break;
	     case "-":
	        result = a-b;
	        System.out.print(a+str+b+"의 계산 결과는 "+result);
	        break;
	     case "*":
	        result = a*b;
	        System.out.print(a+str+b+"의 계산 결과는 "+result);
	        break;
	     case "/":
	        if(b==0) {
	           System.out.print("0으로 나눌 수 없습니다.");
	           break;
	        }
	        else {
	           result = a / b;
	           System.out.print(a+str+b+"의 계산 결과는 "+result);
	           break;
	        }
	     default:
	        System.out.print("잘못 입력하였습니다.");
	     }
	     My_Scan.close();
	}

}
