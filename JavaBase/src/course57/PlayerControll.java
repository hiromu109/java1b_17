package course57;

import java.util.Random;
import java.util.Scanner;

public class PlayerControll {

	public static void main(String[] args) {
		System.out.println("<<ときめき☆こくりある>>");
		Scanner stdIn = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("0:通常モードでプレイする。");
		System.out.println("99:デバックモードでプレイする。");
		int play = stdIn.nextInt();
		Player me = new Player();
		Target koku = new Target();

		if (play == 0) {
			me.setKinnruoku(rnd.nextInt(5) + 1);
			me.setGakuryoku(rnd.nextInt(5) + 1);
			me.setMitame(rnd.nextInt(5) + 1);
			me.setOmosiro(rnd.nextInt(5) + 1);

			koku.setHituyouKin(rnd.nextInt(11) + 3);
			koku.setHituyouGaku(rnd.nextInt(11) + 3);
			koku.setHituyouMita(rnd.nextInt(11) + 3);
			koku.setHituyouOmo(rnd.nextInt(11) + 3);
		} else if (play == 99) {
			System.out.println("あなたの筋力を設定してください");
			int K = stdIn.nextInt();
			me.setKinnruoku(K);
			System.out.println("あなたの学力を設定してください");
			int G = stdIn.nextInt();
			me.setGakuryoku(G);
			System.out.println("あなたの見た目を設定してください");
			int M = stdIn.nextInt();
			me.setMitame(M);
			System.out.println("あなたの面白さを設定してください");
			int O = stdIn.nextInt();
			me.setOmosiro(O);

			System.out.println("彼女の筋力を設定してください");
			int ki = stdIn.nextInt();
			koku.setHituyouKin(ki);
			System.out.println("彼女の学力を設定してください");
			int ga = stdIn.nextInt();
			koku.setHituyouGaku(ga);
			System.out.println("彼女の見た目を設定してください");
			int mi = stdIn.nextInt();
			koku.setHituyouMita(mi);
			System.out.println("彼女の面白さを設定してください");
			int om = stdIn.nextInt();
			koku.setHituyouOmo(om);
		}

		System.out.println("あなたの能力値");
		me.display();

		for (int i = 0; i < 7; i++) {
			System.out.println(" ");
			System.out.println(i + 1 + "回目のトレーニングメニューを選択してください。");
			System.out.println("1;筋トレ 2:勉強 3:整形 4:人と喋る");
			System.out.println("(筋トレ=筋力が1上昇 勉強=学力が1上昇 整形=見た目が1上昇 人と喋る=面白さが1上昇)");
			int tore = stdIn.nextInt();
			int kop = rnd.nextInt(5) + 1;

			if (tore == 1) {
				int mm = me.getKinnruoku() + 1;
				me.setKinnruoku(mm);
			} else if (tore == 2) {
				int mm = me.getGakuryoku() + 1;
				me.setGakuryoku(mm);
			} else if (tore == 3) {
				int mm = me.getMitame() + 1;
				me.setMitame(mm);
			} else if (tore == 4) {
				int mm = me.getOmosiro() + 1;
				me.setOmosiro(mm);
			}
			if (kop == 1) {
				System.out.println("成功に必要な筋力は" + koku.getHituyouKin());
			} else if (kop == 2) {
				System.out.println("成功に必要な学力は" + koku.getHituyouGaku());
			} else if (kop == 3) {
				System.out.println("成功に必要な見た目は" + koku.getHituyouMita());
			} else if (kop == 4) {
				System.out.println("成功に必要な面白さは" + koku.getHituyouOmo());
			} else if (kop == 5) {
				System.out.println("知ることができなかった...");
			}
		}
		System.out.println("<告白フェーズ>");
		System.out.println("あなたの能力値");
		me.display();
		System.out.println(" " + "どの能力で勝負しますか？");
		System.out.println("1;筋力 2:学力 3:見た目 4:面白さ");
		int syoubu = stdIn.nextInt();
		int rn = rnd.nextInt(4) + 1;

		if (syoubu == 1) {
			if (me.getKinnruoku() >= koku.getHituyouKin()) {
				if (rn == 1 && me.getKinnruoku() >= koku.getHituyouKin()) {
					System.out.println("告白成功!!");
					System.out.println("");
					System.out.println("HAPPY END");
				} else if (rn == 2 && me.getGakuryoku() >= koku.getHituyouGaku()) {
					System.out.println("告白成功!!");
					System.out.println("");
					System.out.println("HAPPY END");
				} else if (rn == 3 && me.getMitame() >= koku.getHituyouMita()) {
					System.out.println("告白成功!!");
					System.out.println("");
					System.out.println("HAPPY END");
				} else if (rn == 4 && me.getOmosiro() >= koku.getHituyouOmo()) {
					System.out.println("告白成功!!");
					System.out.println("");
					System.out.println("HAPPY END");
				} else {
					System.out.println("You Died...");
					System.out.println("");
					System.out.println("BAD END");
				}
			} else {
				System.out.println("You Died...");
				System.out.println("");
				System.out.println("BAD END");
			}
		} else if (syoubu == 2) {
			if (me.getKinnruoku() >= koku.getHituyouGaku()) {
				if (rn == 1 && me.getKinnruoku() >= koku.getHituyouKin()) {
					System.out.println("告白成功!!");
					System.out.println("");
					System.out.println("HAPPY END");
				} else if (rn == 2 && me.getGakuryoku() >= koku.getHituyouGaku()) {
					System.out.println("告白成功!!");
					System.out.println("");
					System.out.println("HAPPY END");
				} else if (rn == 3 && me.getMitame() >= koku.getHituyouMita()) {
					System.out.println("告白成功!!");
					System.out.println("");
					System.out.println("HAPPY END");
				} else if (rn == 4 && me.getOmosiro() >= koku.getHituyouOmo()) {
					System.out.println("告白成功!!");
					System.out.println("");
					System.out.println("HAPPY END");
				} else {
					System.out.println("You Died...");
					System.out.println("");
					System.out.println("BAD END");
				}
			} else {
				System.out.println("You Died...");
				System.out.println("");
				System.out.println("BAD END");
			}
		} else if (syoubu == 3) {
			if (me.getMitame() >= koku.getHituyouMita()) {
				if (rn == 1 && me.getKinnruoku() >= koku.getHituyouKin()) {
					System.out.println("告白成功!!");
					System.out.println("");
					System.out.println("HAPPY END");
				} else if (rn == 2 && me.getGakuryoku() >= koku.getHituyouGaku()) {
					System.out.println("告白成功!!");
					System.out.println("");
					System.out.println("HAPPY END");
				} else if (rn == 3 && me.getMitame() >= koku.getHituyouMita()) {
					System.out.println("告白成功!!");
					System.out.println("");
					System.out.println("HAPPY END");
				} else if (rn == 4 && me.getOmosiro() >= koku.getHituyouOmo()) {
					System.out.println("告白成功!!");
					System.out.println("");
					System.out.println("HAPPY END");
				} else {
					System.out.println("You Died...");
					System.out.println("");
					System.out.println("BAD END");
				}
			} else {
				System.out.println("You Died...");
				System.out.println("");
				System.out.println("BAD END");
			}
		} else if (syoubu == 4) {
			if (me.getOmosiro() >= koku.getHituyouOmo()) {
				if (rn == 1 && me.getKinnruoku() >= koku.getHituyouKin()) {
					System.out.println("告白成功!!");
					System.out.println("");
					System.out.println("HAPPY END");
				} else if (rn == 2 && me.getGakuryoku() >= koku.getHituyouGaku()) {
					System.out.println("告白成功!!");
					System.out.println("");
					System.out.println("HAPPY END");
				} else if (rn == 3 && me.getMitame() >= koku.getHituyouMita()) {
					System.out.println("告白成功!!");
					System.out.println("");
					System.out.println("HAPPY END");
				} else if (rn == 4 && me.getOmosiro() >= koku.getHituyouOmo()) {
					System.out.println("告白成功!!");
					System.out.println("");
					System.out.println("HAPPY END");
				} else {
					System.out.println("You Died...");
					System.out.println("");
					System.out.println("BAD END");
				}
			} else {
				System.out.println("You Died...");
				System.out.println("");
				System.out.println("BAD END");
			}
		}
	}
}
