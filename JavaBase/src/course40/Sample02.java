package course40;

public class Sample02 {

	public static void main(String[] args) {
		int[] numbers= {10,20,30,40,50};
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		String[] cities= {"東京","大阪","千葉","神奈川","埼玉笑"};
		for(int i=0;i<cities.length;i++) {
			System.out.println(cities[i]);
		}
		int[] number= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<number.length;i++) {
			sum=sum+numbers[i];
			System.out.println(sum);
		}
		int a=0;
		for(int i=0;i<numbers.length;i++) {
			if(a<numbers[i]) {
				a=numbers[i];
			}
		}
		System.out.println(a);
		
		int[] numbe= {11,20,31,40,51};
		for(int i=0;i<numbe.length;i++) {
			int num=numbe[i]%2;
			if(num==0) {
				System.out.println(numbe[i]);
			}
		}

	}

}
