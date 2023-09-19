package course21;

public class ArrQuestion02 {

	public static void main(String[] args) {
		int[] typhoon = {1,1,0,0,0,1,4,5,6,4,6,1};
		
		for(int i=0; i<typhoon.length; i++) {
			System.out.println(i+1+"月の台風の発生件数は"+typhoon[i]+"件です。");
		}

	}

}
