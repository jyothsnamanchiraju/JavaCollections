package IterviewPreperation.JPMC;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeAPIDemo {

    public static void main(String[] args){
        DateTimeAPIDemo dtad = new DateTimeAPIDemo();
        dtad.displayLocalDateTime();
    }

    public void displayLocalDateTime(){
        //Get Current Date Time
        LocalDateTime ct = LocalDateTime.now();

        System.out.println("Current Time = "+ct);

        LocalDate d1 = ct.toLocalDate();
        System.out.println("Date1 = "+d1);

        LocalDateTime d2 = ct.withDayOfMonth(29).withMonth(2).withYear(2020);
        System.out.println("Date2 = "+d2);

        LocalDate d3 = LocalDate.of(2014,Month.DECEMBER,12);
        System.out.println("Date3 = "+d3);

        LocalTime d4 = ct.toLocalTime(); // LocalTime.of(22,15);
        System.out.println("Date4 = "+d4);

        String s = ct.toLocalDate().toString();
        LocalDate d5 = LocalDate.parse(s);
      //  LocalTime d5 = LocalTime.parse(s);
        System.out.println("Date5 = "+d5);

    }
}
