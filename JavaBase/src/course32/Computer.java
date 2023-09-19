package course32;

public class Computer {
	String name;
	String cpu;
	int memory;
	String gurabo;
	int price;
	

	Computer(String n, String c, int m, String g, int p) {
		name = n;
		cpu = c;
		memory = m;
		gurabo = g;
		price = p;
	}
	int nebiki(int nebikigaku) {
		int x=price-nebikigaku;
		return x;
	}

	void display() {
		System.out.println(name);
		System.out.println(cpu);
		System.out.println(memory);
		System.out.println(gurabo);
		System.out.println(price);

	}
	int chonebiki(int nebikigaku) {
		nebikigaku=nebikigaku*3;
		int modori=price-nebikigaku;
		return modori;
	}
}
