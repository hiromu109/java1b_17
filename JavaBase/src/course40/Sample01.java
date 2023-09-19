package course40;

public class Sample01 {

	public static void main(String[] args) {
		int number=15;
		if(number>10) {
			System.out.println("でか!!!");
		}
		
		int age =20;
		if(age>=18) {
			System.out.println("大人っすね!");
		}else {
			System.out.println("キッズだね＾＾");
		}
		
		boolean isRaining =true;
		if(isRaining) {
			System.out.println("傘をもってけーーー");
		}else {
			System.out.println("良い一日を！");
		}
		
		int num=2;
		int num1=num%2;
		if(num1==0) {
			System.out.println("偶数でっせ");
		}else {
			System.out.println("奇数です");
		}
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		for(int i=1;i<=100;i++) {
			System.out.println("現在"+i+"回目のループです");
			int a=i%2;
			if(a==0) {
				System.out.println("偶数です");
			}
		}
		
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum=sum+i;
			System.out.println(sum);
		}
	}

}
