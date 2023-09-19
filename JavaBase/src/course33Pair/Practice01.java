package course33Pair;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		String moji="私はJavaを勉強中です。";
		System.out.println(moji);
		
		Scanner stdIn=new Scanner(System.in);
		String a=stdIn.next();
		System.out.println(a);
		
		int b=stdIn.nextInt();
		if(b>=50) {
			System.out.println("50以上です");
		}else {
			System.out.println("49以下です");
		}
		
		int x = stdIn.nextInt();
		int[] variable = new int[x];

		
		
	}

}
