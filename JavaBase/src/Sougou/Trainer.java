package Sougou;

import java.util.Random;

public class Trainer {
	String name;
	Pocketon[] myPockes;

	Trainer() {
		this.name = "";
		this.myPockes = new Pocketon[6];
	}

	int k = 0;

	void capture(Pocketon pocke) {
		Random rnd = new Random();
		int z = rnd.nextInt(10) + 1;
		if (z >= pocke.difficult) {
			myPockes[0 + k] = pocke;
			k = k + 1;
			System.out.println("捕獲");
		} else {
			System.out.println("捕獲失敗!!");
		}
	}

	void display() {
		if (this.myPockes[0] == null) {
			System.out.println("空き");
		} else {
			System.out.println(this.myPockes[0].name);
		}
		if (this.myPockes[1] == null) {
			System.out.println("空き");
		} else {
			System.out.println(this.myPockes[1].name);
		}
		if (this.myPockes[2] == null) {
			System.out.println("空き");
		} else {
			System.out.println(this.myPockes[2].name);
		}
		if (this.myPockes[3] == null) {
			System.out.println("空き");
		} else {
			System.out.println(this.myPockes[3].name);
		}
		if (this.myPockes[4] == null) {
			System.out.println("空き");
		} else {
			System.out.println(this.myPockes[4].name);
		}
		if (this.myPockes[5] == null) {
			System.out.println("空き");
		} else {
			System.out.println(this.myPockes[5].name);
		}
	}

}