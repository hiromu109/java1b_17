package course19;

public class Practice04 {

	public static void main(String[] args) {
		int[] logicArray = new int[5];
		logicArray[0] = 100;
		logicArray[1] = 50;
		logicArray[2] = 75;
		logicArray[3] = 80;
		logicArray[4] = 65;
		int savepoint = 0;
		
		for (int i = 0; i < 5; i++) {
			if (logicArray[i] > logicArray[i + 1]) {
				savepoint = logicArray[i];
				logicArray[i] = logicArray[i + 1];
				System.out.println(logicArray[i]);
				logicArray[i + 1] = savepoint;
			}
		}
		
		
	}
}
