package course24;

import java.util.Scanner;

public class PracticeEX {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("足し算をしたいですか？引き算をしたいですか？");
		System.out.println("1:足し算");
		System.out.println("2:引き算");
		int a = stdIn.nextInt();
		System.out.println("計算したい数値を入力してください。");
		System.out.println("1つ目");
		int b = stdIn.nextInt();
		System.out.println("2つ目");
		int c = stdIn.nextInt();
		if (a == 1) {
			plus(b, c);
		} else {
			mainus(b, c);
		}
	}

	static void plus(int x, int y) {
		System.out.println("結果は" + (x + y) + "です。");
	}

	static void mainus(int z, int w) {
		System.out.println("結果は" + (z - w) + "です。");
	}
}
