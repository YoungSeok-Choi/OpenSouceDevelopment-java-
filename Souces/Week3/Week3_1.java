package my.packages;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Week3_1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner X = new Scanner(System.in);
       while(true) {
          System.out.print("���ϰ��� �ϴ� �� �� �Է� >> ");
          try {
             int n = X.nextInt();
            int m = X.nextInt();
             System.out.print(n + "x" + m + "=" + n*m);
             break;
          }catch(InputMismatchException e) {
             System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
             X.nextLine();
          }
       }
       X.close();
	}

}
