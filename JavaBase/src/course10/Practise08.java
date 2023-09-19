package course10;

import java.util.Scanner;

public class Practise08 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1つ目の数値を入力してください。");
		int x = stdIn.nextInt();
		System.out.println("2つ目の数値を入力してください。");
		int y = stdIn.nextInt();
		System.out.println("3つ目の数値を入力してください。");
		int z = stdIn.nextInt();

		if (x >= y) {
			if (x >= z) {
				System.out.println(x + "が一番大きい数値です");
			}

		}
		if (y >= x) {
			if (y >= z) {
				{
					System.out.println(y + "が一番大きい数値です");
				}
			}

			if (z >= x)
				if (z >= y) {
					{
						System.out.println(z + "が一番大きい数値です");
					}

				}
		}

	}

}
