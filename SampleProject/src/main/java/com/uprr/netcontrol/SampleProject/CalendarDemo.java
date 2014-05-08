package com.uprr.netcontrol.SampleProject;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(new Date().getTime());
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.HOUR, 0);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.setLenient(false);
		int startDay = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("StartDay" + startDay);
		int trainMonth = calendar.get(Calendar.MONTH);
		System.out.println("trainMonth" + trainMonth);
		int trainYear = calendar.get(Calendar.YEAR);
		System.out.println("TrainYear" + trainYear);
		if (31 - startDay > 12) {
			trainMonth--;
		} else if (startDay - 31 > 15) {
			trainMonth++;
		}
		if (trainMonth > 11) {
			trainMonth = 0;
			trainYear++;
		} else if (trainMonth < 0) {
			trainMonth = 11;
			trainYear--;
		}
		System.out.println("Train Month" + trainMonth);
		calendar.set(Calendar.MONTH, trainMonth);
		calendar.set(Calendar.DAY_OF_MONTH, 31);
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("dayOfMonth" + dayOfMonth);
		System.out.println("Train Year" + trainYear);
		calendar.set(Calendar.YEAR, trainYear);
		System.out.println(calendar.getTime());
		calendar.getTime();

	}
}
