package course28;

public class Sample01 {

	public static void main(String[] args) {
		//インスタンス
		//「hu1」はHumanのインスタンス(実態)
		//インスタンスに対してパラメータを設定する。
		Human hu1 = new Human();
		hu1.name = "坂本";
		hu1.kotoba = "ラブ＆ピース";
		
		hu1.HP=50;
		hu1.neru();
		
		System.out.println(hu1.name);
		
		Chr numata=new Chr();
		numata.atk=130;
		numata.def=40;
		numata.spd=60;
		numata.love=0;
		numata.mp=20;
		numata.hp=250;
		
		//Chrクラスのインスタンス「kajima」を生成
		//パラメータを設定してみよう

		Chr kajima=new Chr();
		kajima.atk=120;
		kajima.def=120;
		kajima.spd=120;
		kajima.love=120;
		kajima.mp=120;
		kajima.hp=400;	
		
		kajima.naguru(kajima.atk, numata.def);
		
	}

}
