package my.packages;

import java.util.Scanner;

public class Week3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner X = new Scanner(System.in);
	      String str[] = {"����", "����", "��"};
	      String User, Com;
	      int n;
	      System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
	      do {
	         System.out.print("���� ���� ��! >> ");
	         User = X.next();
	         if(User.equals("�׸�")) break;
	         n = (int)(Math.random()*3);
	         Com=str[n];
	         if(User.equals("����")) {
	            if(str[n].equals("����")) {
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Com+" �����ϴ�.");
	               continue;
	            }
	            else if(str[n].equals("����")) {
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Com+" ����ڰ� �����ϴ�.");
	               continue;
	            }
	            else if(str[n].equals("��")) {
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Com+" ����ڰ� �̰���ϴ�.");
	               continue;
	            }
	         }
	         else if(User.equals("����")) {
	            if(str[n].equals("����")) {
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Com+" ����ڰ� �̰���ϴ�.");
	               continue;
	            }
	            else if(str[n].equals("����")) {
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Com+" �����ϴ�.");
	               continue;
	            }
	            else if(str[n].equals("��")) {
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Com+" ����ڰ� �����ϴ�.");
	               continue;
	            }
	         }
	         else if(User.equals("��")) {
	            if(str[n].equals("����")) {
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Com+" ����ڰ� �����ϴ�.");
	               continue;
	            }
	            else if(str[n].equals("����")) {
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Com+" ����ڰ� �̰���ϴ�.");
	               continue;
	            }
	            else if(str[n].equals("��")) {
	               System.out.println("����� = "+User+" , ��ǻ�� = "+Com+" �����ϴ�.");
	               continue;
	            }
	         }
	         System.out.print("����� = "+User+" , ��ǻ�� = "+Com+" ");
	      }while(true);
	      System.out.println("������ �����մϴ�...");
	      X.close();
	}

}
