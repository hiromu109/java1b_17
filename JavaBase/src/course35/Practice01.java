package course35;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("数値を入力してください。");
		int x = stdIn.nextInt();
		if (x >= 50) {
			System.out.println("もう一つ数値を入力してください。");
			int y = stdIn.nextInt();
			calc(x, y);
		} else {
			calc(x);
		}
	}

	static void calc(int a, int b) {
		System.out.println(a + b);
	}

	static void calc(int c) {
		System.out.println(c * 10);
	}
}
