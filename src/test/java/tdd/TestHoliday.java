package tdd;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestHoliday {

	@Test
	void test1() {
		HolidayCalendar holidayCalendar = new HolidayCalendar();
		LocalDate eSaturday = LocalDate.of(2014,3,1);
		//		empezar por el assert
		Assertions.assertTrue(holidayCalendar.isHoliday(eSaturday));
	}

	@Test
	void test2() {
		HolidayCalendar holidayCalendar = new HolidayCalendar();
		LocalDate eMonday = LocalDate.of(2014,3,3);
		//		empezar por el assert
		Assertions.assertFalse(holidayCalendar.isHoliday(eMonday));
	}
	
	@Test
	void test3() {
		HolidayCalendar holidayCalendar = new HolidayCalendar();
		holidayCalendar.makeDayOfWeekAsHoliday(DayOfWeek.SUNDAY);
		LocalDate eSunday = LocalDate.of(2014,3,2);
		//		empezar por el assert
		Assertions.assertTrue(holidayCalendar.isHoliday(eSunday));
	}
}

class HolidayCalendar {
	
	private DayOfWeek dayOfWeekHoliday = DayOfWeek.SATURDAY;

	public boolean isHoliday(LocalDate localDate) {
		return dayOfWeekHoliday.equals(localDate.getDayOfWeek());
	}

	public void makeDayOfWeekAsHoliday(DayOfWeek dayOfWeek) {
		dayOfWeekHoliday = dayOfWeek;
		
	}

}
