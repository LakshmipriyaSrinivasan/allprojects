package com.cts;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Datetimedemo {	
	public static void main(String args[]) {
	/*1)Find date for   “ tenthFeb2017” using LacalDate*/
	LocalDate date1 = LocalDate.of(2017, Month.FEBRUARY, 10);
    System.out.println(date1);
	/*2)Find sixtyfifth day of 2017 using LocalDate*/
    LocalDate date2 = LocalDate.ofYearDay(2017, 65);
    System.out.println(date2);
    /*3)Find 12345th second of the day using LocalTime*/
    LocalTime time = LocalTime.ofSecondOfDay(12345);
    System.out.println(time);
    /*4)Find LocalDateTime object for given date and time 2014-02-20 12:00*/
    LocalDateTime datetime = LocalDateTime.of(2014,Month.FEBRUARY,20,12,00);
    System.out.println(datetime);
    /*5)Show that 5th Feb 2017 is before current date or not( Boolean value)*/
    boolean b=LocalDate.of(2017,2,5).isBefore(LocalDate.now());
    System.out.println(b);
}
}
        /*LocalDate date = LocalDate.of(2017, Month.FEBRUARY, 10);
          System.out.println("date: " + date);
          LocalDate date1=LocalDate.ofYearDay(2017, 65);
          System.out.println("Day: " + date1);
          LocalTime date2=LocalTime.ofSecondOfDay(12345);
          System.out.println("date: " + date2);
          LocalDateTime  date3 = LocalDateTime.of(2014, Month.FEBRUARY, 20, 12, 00);
          System.out.println(date3);
          LocalDate date4 = LocalDate.now();
          LocalDate date5 = LocalDate.parse("2017-02-05");
          System.out.println(date5.isBefore(date4));  */

