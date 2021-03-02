package eCollegeJava;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneExample {

	public static void main(String[] args) {
		ZoneId SFO = ZoneId.of("America/Los_Angeles");
		ZoneId BOS = ZoneId.of("America/New_York");
		ZoneId BLR = ZoneId.of("Asia/Calcutta");

		// Flight 123 , San Francisco to Boston, leaves SFO at 10:30 PM June 13, 2014
		// The fight is 1 hour 30 minutes
		// What is the local time in Boston whe the flight takes off?
		// What is the local time at Boston Logan airport when the fligth arrives?
		// What is the local time in San Francisco when the flight arrives?

		LocalDateTime departure = LocalDateTime.of(2014, Month.JUNE, 13, 10, 22, 30);
		ZonedDateTime departSFO = ZonedDateTime.of(departure, SFO);
		System.out.println("Flight 123 departs at " + departSFO);

		// flight is 5 hours 30 min

		ZonedDateTime arriveBOS = departSFO.plusHours(5).plusMinutes(30).toOffsetDateTime().atZoneSameInstant(BOS);
		System.out.println("Arrive in Boston: " + arriveBOS);

	}

}
