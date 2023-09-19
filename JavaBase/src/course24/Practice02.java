package course24;

public class Practice02 {

	public static void main(String[] args) {
		int a=30;
		bai(a);
		String b="引数だよー";
		moji(b);
		int c=50;
		int d=40;
		niko(c,d);
	}
	static void bai(int x) {
		System.out.println(x*2);
	}
	static void moji(String y) {
		System.out.println(y);
	}
	static void niko(int z,int w) {
		System.out.println(z+w);
	}

}
