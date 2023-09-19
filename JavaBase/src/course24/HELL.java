package course24;

import java.util.Scanner;

public class HELL {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("足し算をしたいですか？引き算をしたいですか？");
		System.out.println("1:足し算");
		System.out.println("2:引き算");
		System.out.println("3:掛け算");
		System.out.println("4:割り算");
		int a = stdIn.nextInt();
		int i = 2;
		System.out.println("1個目の値を入力してください。");
		int z = stdIn.nextInt();

		if (a == 1) {
			while (i <= 100) {
				System.out.println(i + "個目の値を入力してください。");
				int b = stdIn.nextInt();
				if (b == 9999 || i == 100) {
					System.out.println(z);
					break;
				}
				z = z + b;
				i++;
			}
		} else if (a == 2) {
			while (i <= 100) {
				System.out.println(i + "個目の値を入力してください。");
				int b = stdIn.nextInt();
				if (b == 9999 || i == 100) {
					System.out.println(z);
					break;
				}
				z = z - b;
				i++;

			}

		} else if (a == 3) {
			while (i <= 100) {
				System.out.println(i + "個目の値を入力してください。");
				int b = stdIn.nextInt();
				if (b == 9999 || i == 100) {
					System.out.println(z);
					break;
				}
				z = z * b;
				i++;

			}

		} else if (a == 4) {
			while (i <= 100) {
				System.out.println(i + "個目の値を入力してください。");
				int b = stdIn.nextInt();
				if (b == 9999 || i == 100) {
					System.out.println(z);
					break;
				}
				z = z / b;
				i++;

			}

		}
	}
}
