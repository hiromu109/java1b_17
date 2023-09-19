package course29;

public class Character {
	String name;
	int hp;
	int str;
	int dex;
	int agi;
	int def;

	void viewStaus() {
		System.out.println(name + "のステータスは");
		System.out.println("HP" + hp);
		System.out.println("攻撃力" + str);
		System.out.println("防御力" + def);
		System.out.println("命中率" + dex);
		System.out.println("回避率" + agi);
	}

	void battle(Character player1, Character player2) {
		System.out.println();
		System.out.println(player1.name + "と" + player2.name + "の熱い戦いが始まる・・・！");
		//hpが続く限り戦いを続けるための処理
		while (player1.hp > 0 && player2.hp > 0) {
			//player1とplayer2のagiを比較して、高い方が先制攻撃！
			//攻撃は「攻撃者のstr - 被攻撃者のdef」の結果を相手を被攻撃者のHPから引く
			//先制攻撃終了後、agiの低い方が攻撃を行う。
			if (player1.agi > player2.agi) {
				System.out.println(player1.name + "の攻撃!");
				player2.hp = player2.hp - (player1.str - player2.def);
				System.out.println(
						player1.str - player2.def + "のダメージ!!" + player2.name + "のhpは" + player2.hp + "となった...");
				System.out.println();
				player2.agi = player2.agi + 10;
			} else {
				System.out.println(player2.name + "の攻撃!");
				player1.hp = player1.hp - (player2.str - player1.def);
				System.out.println(
						player2.str - player1.def + "のダメージ!!" + player1.name + "のhpは" + player1.hp + "となった...");
				System.out.println();
				player1.agi = player1.agi + 10;
			}
		}
		if (player1.hp < 0) {
			System.out.println(player1.name + "は死亡した。だが、皆の記憶の中で生き続ける。");
		} else {
			System.out.println(player2.name + "は死亡した。だが、皆の記憶の中で生き続ける。");
		}
	}

}
