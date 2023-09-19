package course44;

public class Animal extends Creatures {
	
	private String name;
	private String kari;
	
	void display() {
		System.out.println("名前:"+this.name);
		System.out.println("体重:"+super.getWeight()+"g");
		System.out.println("特徴:"+this.kari);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKari() {
		return kari;
	}

	public void setKari(String kari) {
		this.kari = kari;
	}

}
