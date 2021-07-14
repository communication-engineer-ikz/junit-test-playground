package junit.tutorial;

import static junit.tutorial.IsDate.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.Date;

import org.junit.Test;

public class isDateTest {

	@Test
	public void 日付比較テスト() throws Exception{
		Date actual = new Date(2021, 1, 12);
//		Date date = new Date();

		assertThat(actual, is(dateOf(2021, 1, 12)));
	}
}
