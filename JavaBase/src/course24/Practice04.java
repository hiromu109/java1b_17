package course24;

public class Practice04 {

	public static void main(String[] args) {
		int tensu=100;
		
		calledMethod(tensu);
	}
	static void calledMethod(int x) {
		System.out.println("引数で受け取った値は"+x+"です。");
	}

}
