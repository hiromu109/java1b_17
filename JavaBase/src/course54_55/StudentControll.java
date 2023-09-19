package course54_55;

public class StudentControll {

	public static void main(String[] args) {
		Student tonari = new Student(23,"藤田大吾");
		Student me = new Student(17,"谷口弘武");
		
		Student[] mymen=new Student[2];
		mymen[0]=tonari;
		mymen[1]=me;
		mymen[0].setName("沼田");
		System.out.println(mymen[1].getName());
	}

}
