package course44;

public class Sample01 {

	public static void main(String[] args) {
		int[] numExArr = { 10, 50, 30, 20, 40 };
		
		int x = numExArr[0];
		numExArr[0] = numExArr[4];
		numExArr[4] = x;

		int y = numExArr[1];
		numExArr[1] = numExArr[3];
		numExArr[3] = y;

		System.out.println(numExArr[0]);
		System.out.println(numExArr[1]);
		System.out.println(numExArr[4]);
		System.out.println(numExArr[3]);
	}

}
