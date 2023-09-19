package course10;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		System.out.println("数値を入力してください");
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		System.out.println(x+100);
	}

}
