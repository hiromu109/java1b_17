package course30;

public class UseClass {

	public static void main(String[] args) {
		Drink a = new Drink(100,"初期データ");
		a.display();
		
		a.price = 150;
		a.name = "午後の紅茶";
		
		a.display();
		
		int sum = a.calcSum(a.price, 17);
		System.out.println("合計は" + sum);

	}

}
