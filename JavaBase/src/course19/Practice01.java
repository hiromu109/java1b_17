package course19;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {

		//慣れよう問題①
		String[] mygroup = new String[3];
		mygroup[0] = "根本 晴";
		mygroup[1] = "藤田 大吾";
		mygroup[2] = "渡部 元樹";

		//慣れよう問題②
		int[] mygroupnum = new int[3];
		mygroupnum[0] = 21;
		mygroupnum[1] = 23;
		mygroupnum[2] = 99;

		//慣れよう問題③
		int[] mynum = new int[3];
		mynum[0] = 10;
		mynum[1] = 50;
		mynum[0] = mynum[0] + mynum[1];

		//慣れよう問題④
		Scanner stdIn = new Scanner(System.in);
		int[] myNumScan = new int[3];
		myNumScan[0] = 10;
		myNumScan[1] = stdIn.nextInt();
		myNumScan[2] = myNumScan[0] + myNumScan[1];

	}

}
