package my.packages;

import java.io.*;
import java.util.*;


public class Week8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner(System.in);
		System.out.println("전체 경로명이 아닌 파일 이름만 입력했을 때, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.println("대상 파일명 입력 : ");
		File f = new File("C:\\Users\\최용석\\eclipse-workspace\\opensouce practice\\src\\my\\packages", scan.next());
		scan.nextLine();
		
		try {
			for(;;)
			{
				Scanner filescan = new Scanner(new FileInputStream(f), "MS949");
				int lines = 1;
				System.out.print("검색할 단어나 문장을 입력 : ");
				String word = scan.nextLine();
				if(word.equals("그만"))
				{
					System.out.println("프로그램을 종료합니다.");
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
			System.out.println("오류");
		}
		
	}

}
