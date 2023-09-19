package course17;

public class Sample01 {

	public static void main(String[] args) {

		char c1 = 50;
		char c2 = 'A';
		char c3 = '字';

		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);

		//↓実践
		int num = 50;
		
		char moji = 50;

		System.out.println("intだったら50は:" + num);
		System.out.println("charだったら50は:" + moji);

		//↓数値を扱う型
		byte bytenum = 127;

		short shortnum = 32767;

		int intnum = 2147483647;

		System.out.println(bytenum);
		System.out.println(shortnum);
		System.out.println(intnum);

		//ちなみに、マイナスの値はマイナスつけて変数にしまえばOK
		shortnum = -32768;
		
		System.out.println(shortnum);
	}

}