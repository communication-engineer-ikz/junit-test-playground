package junit.tutorial;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class IsDate extends BaseMatcher<Date> {

	private int yyyy = 0;
	private int mm = 0;
	private int dd = 0; 
	
	IsDate(int yyyy, int mm, int dd) {
		this.yyyy = yyyy;
		this.mm = mm;
		this.dd = dd;
	}

	Object actual;
	
	@Override
	public boolean matches(Object actual) {
		this.actual = actual;

		if (!(actual instanceof Date)) {
			return false;
		} else {
			Calendar cal = Calendar.getInstance();
			cal.setTime((Date) actual);
			
			if (yyyy != cal.get(Calendar.YEAR)) {
				return false;
			} else if (mm != cal.get(Calendar.MONTH)) {
				return false;
			} else if (dd != cal.get(Calendar.DATE)) {
				return false;
			} else {
				return true;
			}
		}
	}

	@Override
	public void describeTo(Description desc) {
		desc.appendValue(String.format("%d/%02d/%02d", yyyy, mm, dd));
		if (actual != null) {
			desc.appendText(" but actual is ");
			desc.appendValue(new SimpleDateFormat("yyyy/MM/dd").format((Date) actual));
		}
	}

	public static Matcher<Date> dateOf(int yyyy, int mm, int dd) {
		return new IsDate(yyyy, mm, dd);
	}
}
