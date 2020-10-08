package my.packages;

import java.util.Scanner;

class Player {
	private int num1, num2, num3;
	public String name;
	public Player(String name) {
		this.name = name;
	}
	public boolean game() {
		num1 = (int) ((Math.random()*3)+1);
		num2 = (int) ((Math.random()*3)+1);
		num3 = (int) ((Math.random()*3)+1);
		System.out.print("\t"+num1+"  "+num2+"  "+num3+"  ");
		if(num1 == num2 && num2 == num3)
			return true;
		else 
			return false;
	}
}

public class Week6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("1번째 선수 이름>>");
		String name = sc.next();
		Player ply1 = new Player(name);
		System.out.print("2번째 선수 이름>>");
		name =sc.next();
		Player ply2 = new Player(name);
		String buffer = sc.nextLine();
		while(true) {
			System.out.print("["+ply1.name+"]:<Enter>");
			buffer = sc.nextLine();
			if(ply1.game()) {
				System.out.println(ply1.name+"님이 이겼습니다!");
				break;
			}
			System.out.println("아쉽군요!");
			System.out.print("["+ply2.name+"]:<Enter>");
			buffer = sc.nextLine();
			if(ply2.game()) {
				System.out.println(ply2.name+"님이 이겼습니다!");
				break;
			}
			System.out.println("아쉽군요!");
		}
		sc.close();
	}

}
