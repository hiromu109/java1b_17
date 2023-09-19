package course24;

public class Sample02 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		plus(a, b);
		System.out.println("呼び出し終わったよ");
	}

	static void plus(int x, int y) {
		System.out.println(x + y);
	}

}
