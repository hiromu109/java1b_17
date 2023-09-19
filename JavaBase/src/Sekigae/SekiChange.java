package Sekigae;

import java.util.Random;
import java.util.Scanner;

public class SekiChange {

	public static void main(String[] args) {
		System.out.println("席替えプログラムです。");
		System.out.println("席をランダム生成したいなら１を、自身で設定したいなら２を入力してください。");
		Scanner stdIn = new Scanner(System.in);
		int settei = stdIn.nextInt();
		//席をランダム生成
		if (settei == 1) {
			Random rnd = new Random();
			//席順を設定する。
			int[][] seki = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 },
					{ 19, 20, 21, 22, 23, 24, }, { 25, 26, 27, 28, 29, 30 }, { 31, 32, 33, 34, 35, 36 } };
			//whileの設定
			int roop = 0;
			while (roop == 0) {
				//999回ループさせてランダムに席を入れ替える。
				for (int i = 0; i < 999; i++) {
					//x,y,z,vで0～5までの数字をランダム生成する。
					int x = rnd.nextInt(6);
					int y = rnd.nextInt(6);
					int z = rnd.nextInt(6);
					int v = rnd.nextInt(6);
					//入れ替えるために一時的に保存しておく場所。
					int savepoint = 0;
					//seki[x][y]とseki[z][v]を入れ替える。
					savepoint = seki[x][y];
					seki[x][y] = seki[z][v];
					seki[z][v] = savepoint;
				}
				System.out.println("現在の席↓");
				//横列の6番目までループする
				for (int i = 0; i < 6; i++) {
					//縦列の6番目までループする
					for (int j = 0; j < 6; j++) {
						//番号が一桁ならばスペースを付けて見やすくする。
						if (seki[i][j] > 9) {
							System.out.print(seki[i][j]);
							System.out.print(" ");
						} else {
							System.out.print(" " + seki[i][j]);
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				System.out.println("確定なら１を、もう一度生成したい場合は２を入力してください。");
				int end = stdIn.nextInt();
				if (end == 1) {
					System.out.println("最終的座席↓");
					//横列の6番目までループする
					for (int i = 0; i < 6; i++) {
						//縦列の6番目までループする
						for (int j = 0; j < 6; j++) {
							if (seki[i][j] > 9) {
								System.out.print(seki[i][j]);
								System.out.print(" ");
							} else {
								System.out.print(" " + seki[i][j]);
								System.out.print(" ");
							}
						}
						System.out.println();
					}
					roop = 1;
				}
			}
		} else if (settei == 2) {
			//席を指定するプログラム
			int[][] seki = new int[6][6];
			System.out.println("席を指定してください");
			//1列目の6番目までループする
			for (int i = 0; i < 6; i++) {
				System.out.println("[0][" + i + "]の座席に入れる番号を指定してください。");
				seki[0][i] = stdIn.nextInt();
			}
			//2列目の6番目までループする
			for (int i = 0; i < 6; i++) {
				System.out.println("[1][" + i + "]の座席に入れる番号を指定してください。");
				seki[1][i] = stdIn.nextInt();
			}
			//3列目の6番目までループする
			for (int i = 0; i < 6; i++) {
				System.out.println("[2][" + i + "]の座席に入れる番号を指定してください。");
				seki[2][i] = stdIn.nextInt();
			}
			//4列目の6番目までループする
			for (int i = 0; i < 6; i++) {
				System.out.println("[3][" + i + "]の座席に入れる番号を指定してください。");
				seki[3][i] = stdIn.nextInt();
			}
			//5列目の6番目までループする
			for (int i = 0; i < 6; i++) {
				System.out.println("[4][" + i + "]の座席に入れる番号を指定してください。");
				seki[4][i] = stdIn.nextInt();
			}
			//6列目の6番目までループする
			for (int i = 0; i < 6; i++) {
				System.out.println("[5][" + i + "]の座席に入れる番号を指定してください。");
				seki[5][i] = stdIn.nextInt();
			}
			System.out.println("現在の席↓");
			//横列の6番目までループする
			for (int i = 0; i < 6; i++) {
				//縦列の6番目までループする
				for (int j = 0; j < 6; j++) {
					if (seki[i][j] > 9) {
						System.out.print(seki[i][j]);
						System.out.print(" ");
					} else {
						System.out.print(" " + seki[i][j]);
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			//whileの設定
			int roop = 0;
			while (roop == 0) {
				System.out.println("席が埋まりました");
				System.out.println("確定なら1,変更なら2を入力してください");
				int sekiumata = stdIn.nextInt();
				//確定か変更か判別
				if (sekiumata == 1) {
					System.out.println("最終的座席↓");
					//横列の6番目までループする
					for (int i = 0; i < 6; i++) {
						//縦列の6番目までループする
						for (int j = 0; j < 6; j++) {
							if (seki[i][j] > 9) {
								System.out.print(seki[i][j]);
								System.out.print(" ");
							} else {
								System.out.print(" " + seki[i][j]);
								System.out.print(" ");
							}
						}
						System.out.println();
					}
					//whileを抜ける
					roop = 1;
				} else {
					System.out.println("変更します");
					System.out.println("入れ替え元を入力してね[0][0]の←側");
					int x1 = stdIn.nextInt();
					System.out.println("入れ替え元を入力してね[0][0]の→側");
					int x2 = stdIn.nextInt();
					System.out.println("入れ替え先を入力してね[0][0]の←側");
					int z1 = stdIn.nextInt();
					System.out.println("入れ替え先を入力してね[0][0]の→側");
					int z2 = stdIn.nextInt();
					int savepoint = 0;
					savepoint = seki[x1][x2];
					seki[x1][x2] = seki[z1][z2];
					seki[z1][z2] = savepoint;
					System.out.println("現在の席↓");
					//横列の6番目までループする
					for (int i = 0; i < 6; i++) {
						//縦列の6番目までループする
						for (int j = 0; j < 6; j++) {
							if (seki[i][j] > 9) {
								System.out.print(seki[i][j]);
								System.out.print(" ");
							} else {
								System.out.print(" " + seki[i][j]);
								System.out.print(" ");
							}
						}
						System.out.println();
					}
				}
			}
		}
		System.out.println("終了");
	}
}
