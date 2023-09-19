package Sekigae;

import java.util.Random;

public class seki3 {

	public static void main(String[] args) {
		//席順を設定する。
		int[][] seki = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 },
				{ 19, 20, 21, 22, 23, 24, }, { 25, 26, 27, 28, 29, 30 }, { 31, 32, 33, 34, 35, 36 } };
		Random rnd = new Random();
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
		for (int i = 0; i < 6; i++) {
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
	}

}
