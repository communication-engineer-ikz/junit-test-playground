package tdd.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addは3と4で7を返す() throws Exception {
		Calculator sut = new Calculator();
		assertThat(sut.add(3, 4), is(7));
	}

	@Test
	public void addは9と2で11を返す() throws Exception {
		Calculator sut = new Calculator();
		assertThat(sut.add(9, 2), is(11));
	}
}
