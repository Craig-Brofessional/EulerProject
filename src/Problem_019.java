// Problem:
/*
 * You are given the following information, but you may prefer to do some research for yourself.
 * 
 * 		1 Jan 1900 was a Monday.
 * 		Thirty days has September,
 * 		April, June and November.
 * 		All the rest have thirty-one,
 * 		Saving February alone,
 * 		Which has twenty-eight, rain or shine.
 * 		And on leap years, twenty-nine.
 * 
 * A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */

// Answer: 

public class Problem_019 {
	
	public static String work(){
		String results = "hello";
		
		//All day numbers and month lengths are 1-based indexed
		final int NUM_MONTHS = 12;
		final int NUM_WEEKDAYS = 7;
		final int[] START_DATE = {1,1,1901,2};
		final int[] END_DATE = {31,12,2000,0};
		final int[] NORMAL_YEAR = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		final int[] LEAP_YEAR = {0,31,29,31,30,31,30,31,31,30,31,30,31};
		
		final int DAY = 0;
		final int MONTH = 1;
		final int YEAR = 2;
		final int WEEKDAY = 3;
		
		
		int day, month, year, weekDay, mondays;
		mondays = 0;
		weekDay = START_DATE[WEEKDAY];
		
		for (year = START_DATE[YEAR]; year <= END_DATE[YEAR]; year++) {
			int[] monthLengths;
			if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
				monthLengths = LEAP_YEAR;
			else
				monthLengths = NORMAL_YEAR;
			
			for (month = 1; month <= NUM_MONTHS; month++) {
				if (weekDay == 1)
					mondays++;
				for (day = 1; day < monthLengths[month]; day++) {					
					System.out.println("Date: " + weekDay + ", " + month + "/" + day + "/" + year + ", mondays = " + mondays);
					weekDay++;
					if (weekDay > NUM_WEEKDAYS)
						weekDay = 1;
				}
			}
		}
		results = "Number of mondays = " + mondays;
		
		return results;
	}
	
}