package course41;

public class Test03 {

	public static void main(String[] args) {
		//11
		moji();
		//12
		calc(10, 11);
		//13
		System.out.println(mojicon("今のとこ全問正解でしょ？"));

	}

	static void moji() {
		System.out.println("メソッド問題");
	}

	static void calc(int a, int b) {
		System.out.println(a * b);
	}

	static String mojicon(String moji) {
		String x = moji + "を受け取りました";
		return x;
	}
}
