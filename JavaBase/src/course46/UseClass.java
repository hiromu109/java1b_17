package course46;

public class UseClass {

	public static void main(String[] args) {

		Cat tama = new Cat();

		tama.setName("たま");
		tama.setShurui("三毛猫");
		tama.setSize("30cmぐらい");

		tama.eat("猫缶");
		tama.run();
		
		tama.display();
		
		Dentaku d=new Dentaku();
		d.calc(12, 20);
		
	}

}
