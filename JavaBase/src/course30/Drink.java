package course30;

public class Drink {
	int price;
	String name;

	Drink(int p,String n){
		price=p;
		name=n;
	}
	void display() {
		System.out.println("商品の名前は"+name);
		System.out.println("値段は"+price);
	}

	static int calcSum(int price, int suryo) {
		int sum = price * suryo;
		return sum;
	}
}
