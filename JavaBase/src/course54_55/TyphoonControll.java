package course54_55;

import java.util.Scanner;

public class TyphoonControll {

	public static void main(String[] args) {
		Typhoon typhoon1 = new Typhoon(1, "2022年4月8日", "マカラス");
		Typhoon typhoon2 = new Typhoon(2, "2022年4月10日", "メーギー");
		Typhoon typhoon3 = new Typhoon(3, "2022年6月30日", "チャバ");
		Typhoon typhoon4 = new Typhoon(4, "2022年7月1日", "アイレー");
		Typhoon typhoon5 = new Typhoon(5, "2022年7月28日", "ソングダー");
		Typhoon typhoon6 = new Typhoon(6, "2022年7月31日", "トローセス");
		Typhoon typhoon7 = new Typhoon(7, "2022年8月9日", "ムーラン");
		Typhoon typhoon8 = new Typhoon(8, "2022年8月12日", "メアリー");
		Typhoon typhoon9 = new Typhoon(9, "2022年8月22日", "マーゴン");
		Typhoon typhoon = new Typhoon(0, "", "");
		Typhoon typhoonE = new Typhoon(0, "", "");

		Typhoon[] typhoonList = new Typhoon[15];
		typhoonList[0] = typhoon1;
		typhoonList[1] = typhoon2;
		typhoonList[2] = typhoon3;
		typhoonList[3] = typhoon4;
		typhoonList[4] = typhoon5;
		typhoonList[5] = typhoon6;
		typhoonList[6] = typhoon7;
		typhoonList[7] = typhoon8;
		typhoonList[8] = typhoon9;
		typhoonList[9] = typhoon;
		

		Scanner stdIn = new Scanner(System.in);
		while (true) {
			System.out.println("現在の台風の名前を表示したい場合は“0”を、");
			System.out.println("編集したい場合は“99”を、");
			System.out.println("台風情報の新規追加したい場合は“55”を入力して下さい。");
			int a = stdIn.nextInt();

			if (a == 0) {
				for (int i = 0; i < 15; i++) {
					System.out.println(typhoonList[i].getAsiaName());
				}
				break;
			} else if (a == 99) {
				System.out.println("変更したい台風番号を入力して下さい。");
				int b = stdIn.nextInt();
				System.out.println("変更後の台風の名前を入力して下さい。");
				String c = stdIn.next();
				typhoonList[b - 1].setAsiaName(c);
				for (int i = 0; i < 15; i++) {
					System.out.println(typhoonList[i].getAsiaName());
				}
			} else if (a == 55) {
				System.out.println("台風番号を入力して下さい。(10～15まで)");
				int d = stdIn.nextInt();
				System.out.println("発生日を入力して下さい。");
				String e = stdIn.next();
				System.out.println("台風名を入力して下さい。");
				String f = stdIn.next();
				if (d >= 10) {
					typhoonE.setTyphoonbango(d);
					typhoonE.setHasseibi(e);
					typhoonE.setAsiaName(f);
					typhoonList[d - 1] = typhoonE;

					for (int i = 0; i < 15; i++) {
						System.out.println(typhoonList[i].getAsiaName());
					}
				} else {
					System.out.println("すでに入っています。");
				}
			} else {
				System.out.println("Error");
				break;
			}
		}
	}
}
