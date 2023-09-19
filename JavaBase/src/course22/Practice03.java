package course22;

public class Practice03 {

	public static void main(String[] args) {
		String[][] ox = new String[3][3];
		
		ox[0][0] = "o";
		ox[0][1] = "x";
		ox[0][2] = "o";
		
		ox[1][0] = "x";
		ox[1][1] = "o";
		ox[1][2] = "x";
		
		ox[2][0] = "o";
		ox[2][1] = "o";
		ox[2][2] = "o";
		int count = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("現在の要素は" + ox[i][j]);
				if ("o".equals(ox[i][j])) {
					count = count + 1;
				}

			}
			System.out.println();
		}
		System.out.println("oの数は" + count + "個");

	}

}
