package course20;

public class Practice05 {

	public static void main(String[] args) {
		String[] arr = { "x", "y", "x", "y", "x" };
		int z = 0;
		for (int i = 0; i < arr.length; i++) {
			if ("x".equals(arr[i])) {
				z = z + 1;
			}
		}
		System.out.println(z);

	}
}
