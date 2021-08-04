package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class NumberUtilsTest {
	
	@Test
	public void 入力値に10を与えるとtrueを返す() {
		NumberUtils nu = new NumberUtils();
		assertThat(nu.isEven(10),is(true));
	}
	
	@Test
	public void 入力値に7を与えるとtrueを返す() {
		NumberUtils nu = new NumberUtils();
		assertThat(nu.isEven(7),is(false));
	}
}
