package course34;

public class Pea {

	public static void main(String[] args) {
		offOff();
		String a = "練習問題";
		String moji = prapra(a);
		System.out.println(moji);
	}

	static void offOff() {
		System.out.println("呼び出されました");
	}

	static String prapra(String x) {
		x = x + "を受け取りました";
		return x;
	}
}
