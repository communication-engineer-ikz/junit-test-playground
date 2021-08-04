package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class CounterTest {
	
	public static class 初期状態の場合 {
		Counter counter;

		@Before
		public void setUp() throws Exception {
			counter = new Counter();
		}
		@Test
		public void 初期状態でincrementメソッドを実行すると1が取得できる() {
			int actual = counter.increment();
			assertThat(actual, is(1));
		}
	}

	public static class incrementを1回実行した状態の場合 {
		Counter counter;

		@Before
		public void setUp() throws Exception {
			counter = new Counter();
			counter.increment();
		}
		@Test
		public void incrementメソッドを1回実行した状態でもう一回実行すると2が取得できる() {
			int actual = counter.increment();
			assertThat(actual, is(2));
		}
	}

	public static class incrementを50回実行した状態の場合 {
		Counter counter;

		@Before
		public void setUp() throws Exception {
			counter = new Counter();
			for (int i = 0; i < 50; i++) {
				counter.increment();
			}
		}
		@Test
		public void incrementメソッドを50回実行した状態でもう一回実行すると51が取得できる() {
			int actual = counter.increment();
			assertThat(actual, is(51));
		}
	}


}
