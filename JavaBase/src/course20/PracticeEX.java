package course20;

public class PracticeEX {

	public static void main(String[] args) {
		String[] arr = { "y", "x", "x", "y", "x", "x", "x", "y"};
		int count = 1;
		String front = "y";
		int save = 0;
		for (int i = 0; i < arr.length; i++) {
			if ("x".equals(arr[i])) {
				if ("x".equals(front)) {
					count = count + 1;
					if (save < count)
						save = count;
				} else {
					front = "x";
				}
			} else {
				if ("x".equals(front)) {
					System.out.println(count+"連続");
					count = 1;
					front = "y";
				} else {
					front = "y";
				}
			}
		}
		System.out.println("最高" + save + "連続");
	}

}
