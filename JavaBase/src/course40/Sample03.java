package course40;

public class Sample03 {

	public static void main(String[] args) {
		printHello();
		multiply(10, 9);
		int a=27;
		int b=34;
		System.out.println(multiplymodori(a, b));
		int number = 28;
		System.out.println(isEven(number));
		String name="沼田T";
		System.out.println(getGreeting(name));
	}

	static void printHello() {
		System.out.println("Hello,World!");
	}

	static void multiply(int x, int y) {
		System.out.println(x * y);
	}

	static int multiplymodori(int x, int y) {
		int z = x * y;
		return z;
	}

	static boolean isEven(int x) {
		int z = x % 2;
		if (z == 0) {
			boolean a = true;
			return a;
		} else {
			boolean a = false;
			return a;
		}
	}
	static String getGreeting(String a) {
		String z="こんにちは,"+a;
		return z;
	}
}
