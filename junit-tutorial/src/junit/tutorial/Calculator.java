package junit.tutorial;

public class Calculator {
	public int multiply(int x, int y) {
		return x * y;
	}
	
	public float divide(int x, int y) {
		if (y == 0) {
			throw new IllegalArgumentException("divide by zero");
		}
		return (float) x / (float) y;
	}

	public int divideAndRoundDown(int i, int j) {
		// TODO 自動生成されたメソッド・スタブ
		
		if (j == 0) {
			throw new IllegalArgumentException("ゼロ割です");
		}

		return (int) i / j;
	}

}
