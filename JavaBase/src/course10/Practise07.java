package course10;

import java.util.Scanner;

public class Practise07 {

	public static void main(String[] args) {
		System.out.println("数値を入力してください。");
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		int x = num % 2;
		if (x == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}
	}
}
