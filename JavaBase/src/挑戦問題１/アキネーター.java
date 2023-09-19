package 挑戦問題１;

import java.util.Scanner;

public class アキネーター {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("性別は？");
		String pr1 = stdIn.next();

		System.out.println("職業は？");
		String pr2 = stdIn.next();

		System.out.println("魚は好き？嫌いなら肉は好き？");
		String pr3 = stdIn.next();

		System.out.println("夏と冬どっちが好き？");
		String pr4 = stdIn.next();

		System.out.println("猫と犬どっちが好き？");
		String pr5 = stdIn.next();

		if (pr1.equals("男性")) {
			if (pr2.equals("エンジニア")) {
				System.out.println("あなたが思い浮かべたのはBさんです！");
			} else {
				if (pr3.equals("魚が嫌い")) {
					System.out.println("あなたが思い浮かべたのはAさんです！");
				} else {
					System.out.println("あなたが思い浮かべたのはCさんです！");
				}
			}
		}

		else {
			if (pr2.equals("営業職")) {
				System.out.println("あなたが思い浮かべたのはFさんです！");
			} else {
				if (pr5.equals("猫派")) {
					System.out.println("あなたが思い浮かべたのはEさんです！");
				} else {
					if (pr5.equals("犬派")) {
						System.out.println("あなたが思い浮かべたのはDさんです！");
					} else {
						System.out.println("該当する人は見当たりません。もう一度やり直してください。");
					}
				}
			}
		}
	}
}
