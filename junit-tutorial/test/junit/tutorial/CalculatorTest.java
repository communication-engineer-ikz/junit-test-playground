package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void multiplyで3と4の乗算結果が取得できる() {
		Calculator calc = new Calculator();
		int expected = 12;
		int actual = calc.multiply(3, 4);
		assertThat(actual, is(expected));
	}
	@Test
	public void multiplyで5と7の乗算結果が取得できる() {
		Calculator calc = new Calculator();
		int expected = 35;
		int actual = calc.multiply(5, 7);
		assertThat(actual, is(expected));
	}

	@Test
	public void divideで3と2の除算結果が取得できる() {
		Calculator calc = new Calculator();
		float expected = 1.5f;
		float actual = calc.divide(3, 2);
		assertThat(actual, is(expected));
	}
	@Test(expected = IllegalArgumentException.class)
	public void divideで5と0のときIllegalArgumentExceptionを送出する() {
		Calculator calc = new Calculator();
		calc.divide(5, 0);
	}

	@Test
	public void divideAndRoundDownで6と2の除算結果が取得できる() {
		Calculator calc = new Calculator();
		int actual = calc.divideAndRoundDown(6, 2);
		assertThat(actual, is(3));
	}
	@Test
	public void divideAndRoundDownで3と2の除算結果が小数点以下切り捨てで取得できる() {
		Calculator calc = new Calculator();
		int actual = calc.divideAndRoundDown(3, 2);
		assertThat(actual, is(1));
	}
	@Test(expected = IllegalArgumentException.class)
	public void divideAndRoundDownで5と0のときIllegalArgumentExceptionを送出する() {
		Calculator calc = new Calculator();
		calc.divideAndRoundDown(5, 0);
	}
}
