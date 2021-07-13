package junit.tutorial;

import org.junit.Test;

public class SleepTest {

	@Test(timeout = 1000L)
	public void タイムアウトすることの確認() {
		Sleep sleep = new Sleep();
		sleep.Sleep5mintues();
	}

	@Test(timeout = 10000L)
	public void 正常終了することの確認() {
		Sleep sleep = new Sleep();
		sleep.Sleep5mintues();
	}

}
