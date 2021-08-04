package junit.tutorial;

import java.util.Date;

import org.junit.Test;

public class isDateTest {

	@SuppressWarnings("deprecation")
	@Test
	public void 日付比較テスト() throws Exception{
		Date actual = new Date(2021, 1, 12);
//		Date date = new Date();

//		assertThat(actual, is(dateOf(2021, 1, 12)));
	}
}
