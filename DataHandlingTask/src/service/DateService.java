package service;

import java.util.Calendar;
import java.util.Date;

public interface DateService {
    Calendar myAge(Calendar birthday);

    void printDate(Calendar calendar);

    long dayDifferences(Date date1, Date date2);

    String stringToDate(String date);
}
