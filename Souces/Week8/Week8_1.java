package my.packages;

import java.io.*;
import java.util.*;


public class Week8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner(System.in);
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է����� ��, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.println("��� ���ϸ� �Է� : ");
		File f = new File("C:\\Users\\�ֿ뼮\\eclipse-workspace\\opensouce practice\\src\\my\\packages", scan.next());
		scan.nextLine();
		
		try {
			for(;;)
			{
				Scanner filescan = new Scanner(new FileInputStream(f), "MS949");
				int lines = 1;
				System.out.print("�˻��� �ܾ ������ �Է� : ");
				String word = scan.nextLine();
				if(word.equals("�׸�"))
				{
					System.out.println("���α׷��� �����մϴ�.");
					return;
				}
				while(filescan.hasNext())
				{
					String line = filescan.nextLine();
					if(line.contains(word))
					{
						System.out.println(lines+":"+line);
					}
					lines++;
				}

			}
		} catch(FileNotFoundException e)
		{
			System.out.println("����");
		}
		
	}

}
