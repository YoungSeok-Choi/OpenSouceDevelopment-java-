package my.packages;

import java.util.Scanner;

public class Week2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner My_Scan = new Scanner(System.in);
		
		
		int centerX, radX;
		int centerY, radY;
		double R1, R2, dist;
		
		System.out.println("ù��° ���� �߽� �� ������ �Է� : ");
		centerX = My_Scan.nextInt();
		radX = My_Scan.nextInt();
		R1 = My_Scan.nextDouble();
		System.out.println("�ι�° ���� �߽� �� ������ �Է� : ");
		centerY = My_Scan.nextInt();
		radY = My_Scan.nextInt();
		R2 = My_Scan.nextDouble();
		
		dist = Math.sqrt(((centerX-centerY)*(centerX-centerY))+((radX-radY)*(radX-radY)));
		
		if(dist <= R1+R2)
			System.out.println("�� ���� ���� ��ģ��.");
		else
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
		
		My_Scan.close();
	}

}
