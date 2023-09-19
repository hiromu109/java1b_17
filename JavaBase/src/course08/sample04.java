package course08;

import java.util.Scanner;

public class sample04 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("あなたは魚、肉、野菜どれが好き？");
		String like = stdIn.next();
		
		//switch分鉄板構文
		switch(like) {
		case "魚":
			System.out.println("魚が好きです。");
			//以降の判定を全スキップ
			break;
		case "肉":
			System.out.println("肉が好きです。");
			break;
		//どれにも該当しない場合
		default:
			System.out.println("野菜派です。");
		
		
		}
		
	
	
	}

}
