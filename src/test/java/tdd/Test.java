package tdd;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;

class Test {

	@org.junit.jupiter.api.Test
	void test1() {
		HolidayCalendar holidayCalendar = new HolidayCalendar();
		LocalDate eSaturday = LocalDate.of(2014,3,1);
		//		empezar por el assert
		Assertions.assertTrue(holidayCalendar.isHoliday(eSaturday));
	}

	void test2() {
		HolidayCalendar holidayCalendar = new HolidayCalendar();
		LocalDate eMonday = LocalDate.of(2014,3,3);
		//		empezar por el assert
		Assertions.assertFalse(holidayCalendar.isHoliday(eMonday));
	}
}

class HolidayCalendar {

	public boolean isHoliday(LocalDate localDate) {
		return DayOfWeek.SATURDAY.equals(localDate.getDayOfWeek());
	}

}
