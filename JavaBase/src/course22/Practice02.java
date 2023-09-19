package course22;

import java.util.Arrays;

public class Practice02 {

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

		System.out.println(Arrays.deepToString(ox));

	}

}
