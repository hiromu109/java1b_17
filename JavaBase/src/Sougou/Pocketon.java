package Sougou;

public class Pocketon {
	String name;
	String type;
	int power;
	int difficult;
	int getted;

	Pocketon(String n, String t, int p, int d) {
		this.name = n;
		this.type = t;
		this.power = p;
		this.difficult = d;
		this.getted = 0;
	}

	void display() {
		System.out.println(name);
		System.out.println(type);
		System.out.println(power);
		System.out.println(difficult);
		System.out.println(getted);

	}

}
