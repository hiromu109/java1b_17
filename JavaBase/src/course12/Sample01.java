package course12;

public class Sample01 {

	public static void main(String[] args) {
		int i = 0;
		do {
			System.out.println("ここに実行したい事を書くよーーーー");
			i++;
		} while (i < 3);

		int x = 0;

		do {
			if (x < 3) {
				System.out.println("if文との組み合わせだよ");

			} else if (x == 2) {
				break;
			}
			x++;
		} while (x < 3);
	}
}
