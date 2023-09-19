package course57;

import java.util.Random;
import java.util.Scanner;

public class kazuate {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		Random rnd = new Random();
		
		int ransu=rnd.nextInt(100)+1;
		
		System.out.println("<<数当てげーむ>>");
		System.out.println("1～100の数字から予想してね。");		
		System.out.println(" ");
		
		int kaisu =1;
		while(true) {
			System.out.println(kaisu+"回目に予想する数字は？");
			int yosou=stdIn.nextInt();
			
			if(ransu==yosou) {
				System.out.println("大当たり!!");
				System.out.println(kaisu+"回目で当てたよ♪");
				break;
			}else if(ransu>yosou) {
				System.out.println("答えは"+yosou+"より大きいよ！");
				kaisu=kaisu+1;
			}else if(ransu<yosou) {
				System.out.println("答えは"+yosou+"より小さいよ！");
				kaisu=kaisu+1;
			}
		}
	}

}
