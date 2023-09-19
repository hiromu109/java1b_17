package course26;

import java.util.Random;
import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//⑥
		int gamecount = 0;
		int wincount = 0;
		int losecount = 0;

		int a = 1000;
		System.out.println("ハイカード！");
		shojikin(a);

		//④
		System.out.print("カードは");
		randam();
		System.out.println("です。次のカードはこれよりもHIGH？LOW？");
		System.out.println("HIGHと予想するなら「1」、LOWと予想するなら「2」");
		int b = stdIn.nextInt();
		System.out.println(a);

		String e = " ";
		String f = end(e);
		if (f.equals("END")) {
			System.out.println(f);
		}
	}

	//①
	static int shojikin(int x) {
		System.out.println("現在の所持金は" + x + "です。");
		return x;
	}

	//③
	static void randam() {
		Random rnd = new Random();
		int num1 = rnd.nextInt(13) + 1;
		System.out.print(num1);
	}

	//⑦
	static String end(String z) {
		Scanner stdIn = new Scanner(System.in);
		int d = stdIn.nextInt();
		if (d == 9999) {
			z = "END";
		} else {
			z = "CONT";
		}
		return z;
	}
}
