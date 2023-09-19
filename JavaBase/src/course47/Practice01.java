package course47;

public class Practice01 {

	public static void main(String[] args) {
		//練習問題①
		try {
			int[] array = { 1, 2, 3 };
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		} catch (Exception e) {
			System.out.println("エラー");
			System.out.println(e);
		}
		//練習問題②
		try {
			int number = 5;
			if (10 / number == 2) {
				System.out.println("numberは5です。");
			}
		} catch (Exception e) {
			System.out.println("0で割ることはできません");
			System.out.println(e);
		}
		//練習問題③
		try {
			int number2 = 5;
			if (100 / number2 == 20) {
				System.out.println("numberは5です。");
			}
		} catch (Exception e) {
			System.out.println("0で割ることはできません");
			System.out.println(e);
		}
		//練習問題④
		try {
			int result = divideNumbers(10, 1);
			System.out.println(result);

		} catch (Exception e) {
			System.out.println("0で割ることはできません");
			System.out.println(e);
		}
	}

	///////これはmainメソッドの外に書いて////////
	public static int divideNumbers(int a, int b) {
		return a / b;
	}
}
