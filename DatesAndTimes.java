package eCollegeJava;

import static java.time.DayOfWeek.TUESDAY;
import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;
import static java.time.temporal.TemporalAdjusters.next;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class DatesAndTimes {


	public static void main(String[] args) {
		// For the OCA exam we need to cover 3 classes:
		// LocalDate, LocalTime and LocalDateTime (Java 8)
		// The OCA exam does not cover time zones
		// java.time package

		System.out.println(LocalDate.now());  // 2021-02-28
		System.out.println(LocalTime.now());	// 09:46:37.683
		System.out.println(LocalDateTime.now());  // 2021-02-28T09:46:37.683


		// The output is going to depend on what date/time you run it and where you live
		// 37.683 is nanoseconds
		// java uses T to separate date and time when converting LocalDateTime to a
		// String

		// In the United States, the month is written before the date. The exam won’t
		// ask you about the difference between 02/03/2015 and 03/02/2015.

		// Just remember that the month comes before the date.
		// Also, Java tends to use a 24-hour clock even though the United States uses a
		// 12-hour clock with a.m./p.m.


		// LocalDate
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20); // 2015-01-20
		LocalDate date2 = LocalDate.of(2015, 1, 20);  // 2015-01-20

		// year, month and day
		// we can use Month constants or pass in the month number directly
		// Month class is a special enum class of the java.time package


		// LocalTime
		LocalTime time1 = LocalTime.of(6, 15); // hour and minute 06:15
		LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds 05:15:30
		LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds

		System.out.println(time3); // 06:15:30.000000200 - in LocalTime nanoseconds has 9 digits preceeded by a
									 // point
		// LocalTime is based om a 24-hour clock


		// LocalDateTime
		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30); // 2015-01-20T06:15:30
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1); // 2021-03-02T09:04:24.028


		//@formatter:off
		//of() method signatures:
		/*public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute)
		public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second)
		public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanos)
		public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute)
		public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second)
		public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second, int nanos)
		public static LocalDateTime of(LocalDate date, LocalTime)*/
		//@formatter:on

		// we do not use constructors because date an time classes have private
		// constructors
		// LocalDate d = new LocalDate(); // DOES NOT COMPILE

		// LocalDate.of(2015, Month.JANUARY, 32); // throws DateTimeException

		// the "old way " in java 1.1:
		// Date jan = new Date(2015, Calendar.JANUARY,1);
		// The Date class represented both date and time together
		// to represent the date without the time we used the Calendar class
		// Calendar c = Calendar.getInstance();
		// c.set(2015, Calendar. JANUARY, 1);
		// Date jan = c.getTime();

		// the "old way":
		// java.util.Date (also Calendar, TimeZone and DateFormat)
		// Instances are mutable - not compatible with lambda
		// Not thread safa
		// Weakely typed calendars
		// One size fits all

		// Dates and Times classes are imuttable, so we have to assign the results to a
		// reference
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(date); // 2014-01-20
		date = date.plusDays(2);
		System.out.println(date); // 2014-01-22

		date = date.plusWeeks(1);
		System.out.println(date); // 2014-01-29

		date = date.plusMonths(1);
		System.out.println(date); // 2014-02-28

		date = date.plusYears(5);
		System.out.println(date); // 2019-02-28



		date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);

		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(dateTime); // 2020-01-20T05:15

		dateTime = dateTime.minusDays(1);
		System.out.println(dateTime); // 2020-01-19T05:15

		dateTime = dateTime.minusHours(10);
		System.out.println(dateTime); // 2020-01-18T19:15

		dateTime = dateTime.minusSeconds(30);
		System.out.println(dateTime); // 2020-01-18T19:14:30
		// java hides the zeros in seconds and nanosseconds when we are not using


		// method chaining
		date = LocalDate.of(2020, Month.JANUARY, 20);
		time = LocalTime.of(15, 30);
		dateTime = LocalDateTime.of(date, time).minusDays(1).minusHours(2).minusSeconds(30);
		System.out.println("dateTime " + dateTime);// 2020-01-19T13:29:30

		date = LocalDate.of(2020, Month.JANUARY, 20);
		// date = date.plusMinutes(1); // DOES NOT COMPILE
		// LocalDate class does not contain time


		// isBefore, isAfter, plusMonths, etc
		System.out.println(date.isBefore(LocalDate.now()));


		// isLeapYear
		System.out.println(LocalDate.now().isLeapYear());


		// getDayOfWeek, getDayOfYear, getDayOfMonth
		System.out.println(LocalDate.now().getDayOfWeek()); // MONDAY, f.ex.
		System.out.println(LocalDate.now().getDayOfMonth());
		System.out.println(LocalDate.now().getDayOfYear()); // 61,f. ex
		System.out.println();


		// with (next())
		// we have to import static java.time.temporal.TemporalAdjusters.* to be able to
		// use next() method
		// we have to import static java.time.DayOfWeek.* , to be able to use TUESDAY
		System.out.print("Next Tuesday date is: ");
		System.out.println(LocalDate.now().with(next(TUESDAY)));


		// truncatedTo()
		// java.tome.temporal.ChronoUnit.*; (half days, hours, weeks)
		LocalTime nowTime = LocalTime.now();
		System.out.println("nowTime = " + nowTime);
		LocalTime nowTimeHoursMins = nowTime.truncatedTo(MINUTES);
		System.out.println("nowTimeHoursMins = " + nowTimeHoursMins);


		// toSecondOfDay
		System.out.println("Total of minutes until now+ " + nowTime.toSecondOfDay() / 60 + " minutes");


		// until
		LocalTime bedtime = LocalTime.of(22, 30);
		System.out.println("hours to bed time:  " + nowTime.until(bedtime, HOURS));


		// atTime
		System.out.println("change the time: " + date.atTime(12, 00));

		// Instant
		// Stores an instant in time of the timeline
		// Useful for: timestamps, e.g. login events
		// methods used to compare before and after
		// java.time.Instant


		// Instant
		Instant now = Instant.now();
		try {
			Thread.sleep(0, 1); // long milliseconds , int nanosseconds
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Instant later = Instant.now();
		System.out.println("Now" + now); // 2021-03-02T17:05:32.352Z //3 nanodigits
		System.out.println("Later" + later); // 2021-03-02T17:05:32.360Z
		System.out.println();


		// Period
		// date-based on ISO-8601 calendar
		// plus and minus work with conceptual day, meaning that it preserves daylight
		// savings
		Period period = Period.ofMonths(1); // P1M
		System.out.println(period);
		date = LocalDate.of(2014, Month.JANUARY, 20);
		LocalDate newDate = date.plus(period); // adds the period

		// Period.ofYears Period.ofDays Period.ofWeeks

		Period everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days

		// Period mehods cannot be chained. Only the last method is used
		Period wrong = Period.ofYears(1).ofWeeks(1); // every week

		// Period is a day or more of time. We cannot specify it for hours an so on
		dateTime = dateTime.plus(period);
		// time = time.plus(period); // UnsupportedTemporalTypeException

		System.out.println();


		// Duration
		// time-based
		// actual seconds and nanoseconds
		// Days are treated as 24 hours, and ignores daylight savings

		Duration one24HourDay = Duration.ofDays(1);
		System.out.println("duraton of 1 day: " + one24HourDay);
		System.out.println(LocalDateTime.now().plus(one24HourDay));
		LocalDateTime beforeDST = LocalDateTime.of(2014, Month.MARCH, 8, 12, 00);
		ZonedDateTime newYorkTime = ZonedDateTime.of(beforeDST, ZoneId.of("America/New_York"));
		System.out.println("Before: " + newYorkTime);
		System.out.println("After: " + newYorkTime.plus(one24HourDay));

		// Formatting Dates and Times
		date = LocalDate.of(2020, Month.JANUARY, 20);
		System.out.println(date.getDayOfWeek()); // MONDAY
		System.out.println(date.getMonth()); // JANUARY
		System.out.println(date.getYear()); // 2020
		System.out.println(date.getDayOfYear()); // 20

		// to simplify the output, we have the format method
		date = LocalDate.of(2020, Month.JANUARY, 20);
		time = LocalTime.of(11, 12, 34);
		dateTime = LocalDateTime.of(date, time);
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

		// ISO is a standard for dates
		// 20
		// 2020-01-20
		// 11:12:34
		// 2020-01-20T11:12:34

		// there are some predefined formats that are useful:
		// DateTimeFormatter.ofLocalizedDate
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(dateTime)); // 1/20/20
		System.out.println(shortDateTime.format(date)); // 1/20/20
		// System.out.println(shortDateTime.format(time));

		// UnsupportedTemporalTypeException
		// a time cannot be formated as a date (ofLocalizedate is used)

		// the following code will print the same. Just changed positions
		System.out.println(dateTime.format(shortDateTime));
		System.out.println(date.format(shortDateTime));
		// System.out.println(time.format(shortDateTime));


		// ofLocalizedTime: will work only with LocalTime and LocalDateTime instances
		// ofLocalizedDate: will work only with LocalDate and LocalDateTime instances
		// ofLocalizedDateTime: will work with LocalDateTime instance
		System.out.println();


		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(shortF.format(dateTime)); // 1/20/20 11:12 AM
		System.out.println(mediumF.format(dateTime)); // Jan 20, 2020 11:12:34 AM

		// We can create our own formatter
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println(dateTime.format(f)); // January 20, 2020, 11:12

		// M outputs 1, MM outputs 01, MMM outputs Jan, and MMMM outputs January.
		// dd means to include the leading zero for a single-digit month.
		// , Use , if you want to output a comma (this also appears after the year).
		// yy outputs a two-digit year and yyyy outputs a four-digit year.
		// hh to include the leading zero of the hour if you’re outputting a singledigit
		// hour
		// : Use : if you want to output a colon.
		// m represents the minute.

		// Formatting Dates in Java 7 and Earlier
		// the “old way”; it just uses a different class:
		// SimpleDateFormat sf = new SimpleDateFormat("hh:mm");
		// sf.format(jan3);

		f = DateTimeFormatter.ofPattern("hh:mm");
		f.format(dateTime);
		// f.format(date);// EXCEPTION
		f.format(time);
		// We can only use this formatter with objects containing times. Therefore, line
		// 6 will throw an exception.

		// parse
		// converting Strings into Dates and Times objects
		f = DateTimeFormatter.ofPattern("MM dd yyyy");
		date = LocalDate.parse("01 02 2015", f);
		time = LocalTime.parse("11:22");
		System.out.println(date); // 2015-01-02
		System.out.println(time); // 11:22





		/*
		 * Coordinated Universal Time (UTC) was designed to provide a more accurate
		 * timekeeping system. Although UTC and GMT (Greenwich Mean Time) indicate the
		 * same time, UTC is based
		 * on the more precise mechanism of time measurement. Nevertheless, both of
		 * these time standards are widely used in the world for a similar purpose of
		 * time coordination.
		 */

		/*
		 * The primary reason why UTC was considered to be a more accurate system was
		 * the fact that it used the rotation of Earth and atomic clocks for
		 * measurements. Moreover, to maintain the consistent time system, UTC does not
		 * observe Daylight Saving Time (unlike GMT).
		 */
	}

}
