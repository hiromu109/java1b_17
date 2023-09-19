package course15;

import java.util.Random;
import java.util.Scanner;

public class Pea02 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		Random rnd = new Random();
		int x = 10000;
		while (x > 0) {
			//xは所持金
			System.out.println("現在の所持金は" + x + "円です。");
			System.out.println("いくら賭けますか？");
			int kakekin = stdIn.nextInt();
			int num1 = rnd.nextInt(7) + 1;
			int num2 = rnd.nextInt(7) + 1;
			int num3 = rnd.nextInt(7) + 1;
			//さいころを表示
			System.out.print(num1 + " ");
			System.out.print(num2 + " ");
			System.out.print(num3 + " ");
			System.out.println();
			//チンチロのシステム
			//ピンゾロ
			if (num1 == 1 && num2 == 1 && num3 == 1) {
				x=x-kakekin;
				kakekin = kakekin * 5;
				x = x + kakekin;
				//ゾロ目
			} else if (num1 == num2 && num2 == num3) {
				x=x-kakekin;
				kakekin = kakekin * 3;
				x = x + kakekin;
				//通常の目
			} else if (num1 == num2 || num2 == num3 || num1 == num3) {
				//ションベン
				if ((num1 == 7 && num2 == 7) || (num2 == 7 && num3 == 7) || (num1 == 7 && num3 == 7)) {
					x = x - kakekin;
				}
				x = x - kakekin;
				x = x + kakekin;
				//シゴロ	
			} else if (num1 > 3 && num2 > 3 && num3 > 3) {
				if (num1 != num2 && num2 != num3 && num1 != num3) {
					x=x-kakekin;
                    kakekin = kakekin * 2;
					x = x + kakekin;
				}
				//一二三
			} else if (num1 < 4 && num2 < 4 && num3 < 4) {
				if (num1 != num2 && num2 != num3 && num1 != num3) {
					
					kakekin = kakekin * 2;
					x = x - kakekin;
				}
				//役なし
			} else {
				x = x - kakekin;
			}
			if (x >= 50000) {
				System.out.println("おめでとう！");
				break;
			}
		}
		System.out.println("1050年地下労働行き！");
	}
}
