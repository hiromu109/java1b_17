package course39;

public class UseClass {
	public static void main(String[] args) {

		Student a = new Student();
		a.name = "谷口弘武";
		a.no = 17;

		Student b = new Student();
		b.name = "伊藤功惺";
		b.no = 1;

		Student[] myfriend = new Student[2];
		myfriend[0] = a;
		myfriend[1] = b;

		for (int i = 0; i < 2; i++) {
			System.out.println(myfriend[i].name);
		}
	}

}
