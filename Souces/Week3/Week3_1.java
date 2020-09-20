package my.packages;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Week3_1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner X = new Scanner(System.in);
       while(true) {
          System.out.print("곱하고자 하는 두 수 입력 >> ");
          try {
             int n = X.nextInt();
            int m = X.nextInt();
             System.out.print(n + "x" + m + "=" + n*m);
             break;
          }catch(InputMismatchException e) {
             System.out.println("실수는 입력하면 안됩니다.");
             X.nextLine();
          }
       }
       X.close();
	}

}
