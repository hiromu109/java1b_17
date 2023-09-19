package course15;

import java.util.Random;
import java.util.Scanner;

public class Pea1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int shoji = 10000;
		System.out.println("あなたの所持金は" + shoji + "です。いくら掛けますか？");
		int kakekin = stdIn.nextInt();
		int y = shoji-kakekin;

		Random rnd = new Random();

		int num1 = rnd.nextInt(7) + 1;
		int num2 = rnd.nextInt(7) + 1;
		int num3 = rnd.nextInt(7) + 1;

		System.out.println(num1 + "," + num2 + "," + num3);{
        if(num1+num2+num3==3) {System.out.println(kakekin*5);}
        else if(num1==num2&&num2==num3&&num1!=1) {System.out.println(y+kakekin*3);}//ピンゾロ
        else if(num1==4&&num2==5&&num3==6) {System.out.println(y+kakekin*2);}//４
        else if(num1==num2||num1==num3||num2==num3) {System.out.println(y+kakekin);}
        else if(num1==1&&num2==2&&num3==3) {System.out.println(shoji-kakekin*2);}
        else if(num1==num2&&num1==7||num1==num3&&num1==7||num2==num3&&num2==7) {System.out.println(y);}
        else {System.out.println(y);}
   
        
	}
}}
