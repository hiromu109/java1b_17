package course19;

public class Sample01 {

	public static void main(String[] args) {
		
		String a ="根本 はる";
		String b ="藤田 だいご";
		String c ="大野 まさくに";
		String d ="鈴木 はるや";
		String e ="谷口 ひろむ";
		String f ="西口 ねね";
		String g ="安田 たいと";
		String h ="坂本 こうへい";
		String i ="藤平 りくと";
		String j ="伊藤 そら";
		
		//配列の鉄板構文
		//[]のことを要素と呼ぶ。要素は0から始まる。
		String[] nameList = new String[10];
		nameList[0]="根本 はる";
		nameList[1]="藤田 だいご";
		nameList[2]="大野 まさくに";
		nameList[3]="鈴木 はるや";
		nameList[4]="西口 ねね";
		nameList[5]="安田 たいと";
		nameList[6]="坂本 こうへい";
		nameList[7]="藤平 りくと";
		nameList[8]="伊藤 そら";
		
		for (int x=0; x<3; x++) {
			System.out.println("俺の友達の名前は"+nameList[x]+"だ。");
		}
		

	}

}
