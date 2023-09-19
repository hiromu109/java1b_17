package course10;

import java.util.Scanner;

public class Practise09 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("予約したい曜日を入力してください。");
		String moji = stdIn.next();
		
		switch(moji) {
		case "日曜":
		case "火曜":
		case "金曜":
			System.out.println("休診日です。予約できません。");
			break;
		default:
			System.out.println("予約できます。");
		}
		
	}

}
