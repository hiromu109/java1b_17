package Sekigae;

import java.util.Random;

public class Sekigae {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[][] seki = new int[6][6];
		for (int i = 0; i < 6; i++) {
			seki[0][i] = rnd.nextInt(36) + 1;
		}
		for (int i = 0; i < 6; i++) {
			seki[1][i] = rnd.nextInt(36) + 1;
		}
		for (int i = 0; i < 6; i++) {
			seki[2][i] = rnd.nextInt(36) + 1;
		}
		for (int i = 0; i < 6; i++) {
			seki[3][i] = rnd.nextInt(36) + 1;
		}
		for (int i = 0; i < 6; i++) {
			seki[4][i] = rnd.nextInt(36) + 1;
		}
		for (int i = 0; i < 6; i++) {
			seki[5][i] = rnd.nextInt(36) + 1;
		}

		
		System.out.println("現在の席↓");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(seki[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
