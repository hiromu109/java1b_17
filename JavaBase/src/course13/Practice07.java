package course13;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int xx = stdIn.nextInt();
		for (int i = 0; i < xx; i++) {
			System.out.println(i);
			int y = i % 2;
			if (y == 0) {
				System.out.println("偶数です。");
			} else {
				System.out.println("奇数です。");
			}
			if (i >=100) {
				System.out.println("どれだけ回すの…");
			}

		}

	}

}
