package Sougou;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Trainer trainer = new Trainer();
		System.out.println("あなたの名前を入力して下さい。");
		trainer.name = stdIn.next();
		while (true) {
			System.out.println("メニューを選択して下さい。");
			System.out.println("1…捕獲");
			System.out.println("2…図鑑を見る");
			System.out.println("3…バトル");
			System.out.println("99…プログラム終了");
			int a = stdIn.nextInt();

			Pocketon pocketon = new Pocketon("", "", 0, 0);
			if (a == 1) {
				System.out.print("捕獲したいポケモンの");
				System.out.println("名前を入力してください");
				pocketon.name = stdIn.next();
				System.out.println("タイプ(炎or水or地面or草)を入力してください");
				pocketon.type = stdIn.next();
				System.out.println("戦闘力を入力してください");
				pocketon.power = stdIn.nextInt();
				System.out.println("捕獲難易度を入力して下さい(1～10)");
				pocketon.difficult = stdIn.nextInt();
				trainer.capture(pocketon);
				trainer.display();
			} else if (a == 2) {
				trainer.display();
			} else if (a == 3) {

				Battle battle = new Battle();
				System.out.println("1匹目のポケトンの名前を入力してください。");
				String b = stdIn.next();
				System.out.println("2匹目のポケトンの名前を入力してください。");
				String c = stdIn.next();
				int u;
				int k;
				for (u = 0; (!(trainer.myPockes[u].equals(b))) && u < pocketon.getted; u++) {
				}
				for (k = 0; (!(trainer.myPockes[k].equals(c))) && k < pocketon.getted; k++) {
				}

				String winner = battle.doBattle(trainer.myPockes[u], trainer.myPockes[k]);
				System.out.println(winner + "の勝利");
			} else if (a == 99) {
				break;
			}
		}
	}
}