package course41;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		//1
		String moji = "模擬テスト。100点取ります。";
		System.out.println(moji);
		//2
		int x = 50;
		int y = 100;
		int z = x * y;
		System.out.println(z);
		//3
		Scanner stdIn = new Scanner(System.in);
		String a = stdIn.next();
		System.out.println(a);
		//4
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "回目のループです");
		}
		//5
		int b = stdIn.nextInt();
		if (b >= 50) {
			System.out.println("50以上です。");
		} else {
			System.out.println("49以下です。");
		}
		//6
		boolean isRaining = true;
		if (isRaining) {
			System.out.println("傘をもってけーーー");
		} else {
			System.out.println("良い1日を！");
		}
		//7
		int[] numArr = { 10, 50, 30, 20, 40 };
		//8
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
		//9
		int c = 0;
		for (int i = 0; i < 4; i++) {
			if (numArr[i] > numArr[i + 1]) {
				c = numArr[i];
				numArr[i] = numArr[i + 1];
				numArr[i + 1] = c;
			}
		}
		for (int i = 0; i < 4; i++) {
			if (numArr[i] > numArr[i + 1]) {
				c = numArr[i];
				numArr[i] = numArr[i + 1];
				numArr[i + 1] = c;
			}
		}
		for (int i = 0; i < 3; i++) {
			if (numArr[i + 1] > numArr[i + 2]) {
				c = numArr[i + 1];
				numArr[i + 1] = numArr[i + 2];
				numArr[i + 2] = c;
			}
		}
		for (int i = 0; i < 2; i++) {
			if (numArr[i + 2] > numArr[i + 3]) {
				c = numArr[i + 2];
				numArr[i + 2] = numArr[i + 3];
				numArr[i + 3] = c;
			}
		}
		for (int i = 0; i < 1; i++) {
			if (numArr[i + 3] > numArr[i + 4]) {
				c = numArr[i + 3];
				numArr[i + 3] = numArr[i + 4];
				numArr[i + 3] = c;
			}
		}
		for (int i = 0; i < 0; i++) {
			if (numArr[i + 4] > numArr[i + 5]) {
				c = numArr[i + 4];
				numArr[i + 4] = numArr[i + 5];
				numArr[i + 4] = c;
			}
		}
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
	}

}
