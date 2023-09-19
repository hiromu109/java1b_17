package course21;

import java.util.Scanner;

public class ArrQuestion03 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] queike = { 153, 127, 130, 109, 118, 164, 130, 103, 103, 104, 123, 141 };
		int[] typhoon = { 1, 1, 0, 0, 0, 1, 4, 5, 6, 4, 6, 1 };
		int[] rain = { 20, 58, 107, 87, 114, 187, 200, 59, 169, 441, 158, 94 };

		System.out.println("知りたい情報はなんですか？");
		System.out.println("1.地震の件数 2.台風の件数 3.降水量");
		int a = stdIn.nextInt();

		System.out.println("知りたいのは 1.年別？ 2.月別？");
		int b = stdIn.nextInt();

		int sum = 0;
		if (a == 1) {
			if (b == 1) {
				for (int i = 0; i < queike.length; i++) {
					sum = sum + queike[i];
				}
				System.out.println("1年間に起こった地震の総合計は" + sum + "件です。");
			} else {
				System.out.println("知りたいのは何月ですか？");
				int c = stdIn.nextInt();
				c = c - 1;
				System.out.println(c + 1 + "月の地震の件数は" + queike[c] + "件です。");
			}
		}
		if (a == 2) {
			if (b == 1) {
				for (int i = 0; i < typhoon.length; i++) {
					sum = sum + typhoon[i];
				}
				System.out.println("1年間に起こった台風の総合計は" + sum + "件です。");
			} else {
				System.out.println("知りたいのは何月ですか？");
				int c = stdIn.nextInt();
				c = c - 1;
				System.out.println(c + 1 + "月の台風の件数は" + typhoon[c] + "件です。");
			}
		}
		if (a == 3) {
			if (b == 1) {
				for (int i = 0; i < rain.length; i++) {
					sum = sum + rain[i];
				}
				System.out.println("1年間に起こった降水量の総合計は" + sum + "mmです。");
			} else {
				System.out.println("知りたいのは何月ですか？");
				int c = stdIn.nextInt();
				c = c - 1;
				System.out.println(c + 1 + "月の降水量は" + rain[c] + "mmです。");
			}
		}

	}

}
