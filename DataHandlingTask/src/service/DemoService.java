package service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DemoService {
    public void start() {
        DateService dateService = new DateService();

        Calendar birthday = new GregorianCalendar(1999, Calendar.JULY, 7,13,0, 0);
        Calendar myAge = dateService.myAge(birthday);
        System.out.println("My age");
        dateService.printDate(myAge);

        System.out.println();
        System.out.println("Day differences in date");
        Date date1 = new Date(1921,Calendar.JULY,25);
        Date date2 = new Date(2019,Calendar.JULY,22);
        System.out.println(dateService.dayDifferences(date1, date2));

        System.out.println();
        System.out.println("StringToDate");
        String inputDate = "Friday, Aug 10, 2016 12:10:56 PM";

        System.out.println(dateService.stringToDate(inputDate));
    }
}
