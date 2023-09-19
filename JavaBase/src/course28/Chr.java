package course28;

public class Chr {

	static int atk;
	static int def;
	static int spd;
	static int love;
	static int mp;
	static int hp;

	static void naguru(int naguruatk, int naguraredef) {
		System.out.println(naguruatk - naguraredef + "のダメージを与えた");
	}

	static void mamoru() {
		System.out.println("守りを固めて防御が" + (def * 2) + "になった");
	}
}
