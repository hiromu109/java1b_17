package course23;

import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
		String[][] x = { { "☆", "□", "△" }, { "□", "☆", "□" }, { "☆", "△", "△" } };
		Scanner stdIn = new Scanner(System.in);
		String save = "0";
		int count = 0;
		while (count <=9 ) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {

					System.out.println("入れ替え位置を入力してください。[0][0]左側の添え字");
					int a = stdIn.nextInt();
					System.out.println("入れ替え位置を入力してください。[0][0]右側の添え字");
					int b = stdIn.nextInt();
					System.out.println("入れ替え先を入力してください。[0][0]左側の添え字");
					int c = stdIn.nextInt();
					System.out.println("入れ替え先を入力してください。[0][0]右側の添え字");
					int d = stdIn.nextInt();

					save = x[a][b];
					x[a][b] = x[c][d];
					x[c][d] = x[a][b];
					if (x[i][j].equals(x[i][j - 1]) && x[i][j].contains(x[i][j + 1])) {
						x[i][j] = "G";
						x[i][j - 1] = "G";
						x[i][j + 1] = "G";
						count = count + 3;
					}
					if(count==9) {
						System.out.println("クリア");
						break;
					}
				}

			}
		}

	}
}