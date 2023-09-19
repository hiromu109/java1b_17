package course12;

public class Practice04 {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 9) {
			int j = 1;
			while (j <= 9) {
				System.out.print(i * j + ",");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}