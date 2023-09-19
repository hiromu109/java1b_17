package course10;

import java.util.Scanner;

public class Practise10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("予約したい曜日を入力してください。");
		String moji = stdIn.next();
		System.out.println("午前、午後、夜間を選んで入力してください。");
		String moji2 = stdIn.next();
		String z = moji+moji2;
		
		switch(z) {
		case "日曜午前":
		case "日曜午後":
		case "日曜夜間":
		case "火曜午前":
		case "水曜夜間":
		case "金曜午前":
		case "土曜午後":
		case "土曜夜間":
			System.out.println("休診日です。予約できません。");
		    break;
		case "月曜午前":
		case "月曜午後":
		case "月曜夜間":
		case "火曜午後":
		case "火曜夜間":
		case "水曜午前":
		case "水曜午後":
		case "木曜午前":
		case "木曜午後":
		case "木曜夜間":
		case "金曜午後":
		case "金曜夜間":
		case "土曜午前":
			System.out.println("予約できます。");
		    break;
		 default:
			System.out.println("エラーです。正しく入力してください。");

	}
	}

}
