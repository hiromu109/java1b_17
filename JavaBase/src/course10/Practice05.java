package course10;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		System.out.println("xの数値を入力してください。");
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		System.out.println("yの数値を入力してください。");
		int y = stdIn.nextInt();
		
		if(x>=y) {System.out.println("xがでかい！");
		}
		if(x<=y) {System.out.println("yがでかい！");
		}
		if(x==y) {System.out.println("おなじー");
		}
	}
}
