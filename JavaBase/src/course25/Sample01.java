package course25;

public class Sample01 {

	public static void main(String[] args) {
		int z = modoSample(30, 50);

		System.out.println("30と50の合計値は" + z + "です。");

	}

	static int modoSample(int x, int y) {
		int sum = x + y;
		return sum;
	}

}
