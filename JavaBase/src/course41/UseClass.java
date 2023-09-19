package course41;

public class UseClass {

	public static void main(String[] args) {
		//15
		Product pro1 = new Product();
		pro1.no = "A001";
		pro1.name = "Item1";
		pro1.price = 200;
		pro1.quantity = 10;
		pro1.display();
		//16
		Food fo1 = new Food();
		fo1.name = "野菜";
		fo1.price = 200;
		fo1.display();
		//17
		Food[] menu = new Food[4];
		menu[0] = fo1;

		Food fo2 = new Food();
		fo2.name = "肉";
		fo2.price = 1000;

		Food fo3 = new Food();
		fo3.name = "魚";
		fo3.price = 250;

		Food fo4 = new Food();
		fo4.name = "フルーツ";
		fo4.price = 220;

		menu[1] = fo2;
		menu[2] = fo3;
		menu[3] = fo4;
		//EX
		for (int i = 0; i < 4; i++) {
			System.out.println(menu[i].name);
		}
		int c = 0;
		for (int i = 0; i < 3; i++) {
			if (menu[i].price > menu[i + 1].price) {
				c = menu[i].price;
				menu[i].price = menu[i + 1].price;
				menu[i + 1].price = c;
			}
		}
		for (int i = 0; i < 3; i++) {
			if (menu[i].price > menu[i + 1].price) {
				c = menu[i].price;
				menu[i].price = menu[i + 1].price;
				menu[i + 1].price = c;
			}
		}
		for (int i = 0; i < 2; i++) {
			if (menu[i + 1].price > menu[i + 2].price) {
				c = menu[i + 1].price;
				menu[i + 1].price = menu[i + 2].price;
				menu[i + 2].price = c;
			}
		}
		for (int i = 0; i < 1; i++) {
			if (menu[i + 2].price > menu[i + 3].price) {
				c = menu[i + 2].price;
				menu[i + 2].price = menu[i + 3].price;
				menu[i + 3].price = c;
			}
		}
		for (int i = 0; i < 0; i++) {
			if (menu[i + 3].price > menu[i + 4].price) {
				c = menu[i + 3].price;
				menu[i + 3].price = menu[i + 4].price;
				menu[i + 4].price = c;
			}
		}
		for (int i = 0; i < 4; i++) {
			System.out.println(menu[i].price);
		}
	}

}
