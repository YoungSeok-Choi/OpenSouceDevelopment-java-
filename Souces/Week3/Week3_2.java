package my.packages;

import java.util.Scanner;

public class Week3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner X = new Scanner(System.in);
	      String str[] = {"가위", "바위", "보"};
	      String User, Com;
	      int n;
	      System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
	      do {
	         System.out.print("가위 바위 보! >> ");
	         User = X.next();
	         if(User.equals("그만")) break;
	         n = (int)(Math.random()*3);
	         Com=str[n];
	         if(User.equals("가위")) {
	            if(str[n].equals("가위")) {
	               System.out.println("사용자 = "+User+" , 컴퓨터 = "+Com+" 비겼습니다.");
	               continue;
	            }
	            else if(str[n].equals("바위")) {
	               System.out.println("사용자 = "+User+" , 컴퓨터 = "+Com+" 사용자가 졌습니다.");
	               continue;
	            }
	            else if(str[n].equals("보")) {
	               System.out.println("사용자 = "+User+" , 컴퓨터 = "+Com+" 사용자가 이겼습니다.");
	               continue;
	            }
	         }
	         else if(User.equals("바위")) {
	            if(str[n].equals("가위")) {
	               System.out.println("사용자 = "+User+" , 컴퓨터 = "+Com+" 사용자가 이겼습니다.");
	               continue;
	            }
	            else if(str[n].equals("바위")) {
	               System.out.println("사용자 = "+User+" , 컴퓨터 = "+Com+" 비겼습니다.");
	               continue;
	            }
	            else if(str[n].equals("보")) {
	               System.out.println("사용자 = "+User+" , 컴퓨터 = "+Com+" 사용자가 졌습니다.");
	               continue;
	            }
	         }
	         else if(User.equals("보")) {
	            if(str[n].equals("가위")) {
	               System.out.println("사용자 = "+User+" , 컴퓨터 = "+Com+" 사용자가 졌습니다.");
	               continue;
	            }
	            else if(str[n].equals("바위")) {
	               System.out.println("사용자 = "+User+" , 컴퓨터 = "+Com+" 사용자가 이겼습니다.");
	               continue;
	            }
	            else if(str[n].equals("보")) {
	               System.out.println("사용자 = "+User+" , 컴퓨터 = "+Com+" 비겼습니다.");
	               continue;
	            }
	         }
	         System.out.print("사용자 = "+User+" , 컴퓨터 = "+Com+" ");
	      }while(true);
	      System.out.println("게임을 종료합니다...");
	      X.close();
	}

}
