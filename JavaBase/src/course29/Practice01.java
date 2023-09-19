package course29;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Character me = new Character();
		System.out.println("あなたの名前を入力して下さい。");
		me.name = stdIn.next();
		System.out.println("HPを入力して下さい。");
		me.hp = stdIn.nextInt();
		System.out.println("攻撃力を入力して下さい。");
		me.str = stdIn.nextInt();
		System.out.println("防御力を入力して下さい。");
		me.def = stdIn.nextInt();
		System.out.println("命中率を入力して下さい。");
		me.dex = stdIn.nextInt();
		System.out.println("回避率を入力して下さい。");
		me.agi = stdIn.nextInt();
		me.viewStaus();
		System.out.println();

		Character tonari = new Character();
		System.out.println("相手の名前を入力して下さい。");
		tonari.name = stdIn.next();
		System.out.println("HPを入力して下さい。");
		tonari.hp = stdIn.nextInt();
		System.out.println("攻撃力を入力して下さい。");
		tonari.str = stdIn.nextInt();
		System.out.println("防御力を入力して下さい。");
		tonari.def = stdIn.nextInt();
		System.out.println("命中率を入力して下さい。");
		tonari.dex = stdIn.nextInt();
		System.out.println("回避率を入力して下さい。");
		tonari.agi = stdIn.nextInt();
		tonari.viewStaus();

		me.battle(me, tonari);

	}

}
