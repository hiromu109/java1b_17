package course09;

import java.util.Scanner;

public class Practise04 {

	public static void main(String[] args) {
		System.out.println("誕生日を入力してね。例：3月なら「3」と入力。");
		Scanner stdIn = new Scanner(System.in);
		int month = stdIn.nextInt();
		
		switch(month) {
		case 1:
		case 2:
		case 3:
			System.out.println("★大吉★");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("中吉");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("小吉");
			break;
		default:
			System.out.println("⚡大凶⚡");
			
		
		}

	}

}
