package service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateService implements DateServiceImpl {
    @Override
    public Calendar myAge(Calendar birthday) {
        Calendar currentTime = new GregorianCalendar();
        currentTime.add(Calendar.YEAR, -birthday.get(Calendar.YEAR));
        currentTime.add(Calendar.MONTH, -birthday.get(Calendar.MONTH));
        currentTime.add(Calendar.DAY_OF_MONTH, -birthday.get(Calendar.DAY_OF_MONTH));
        currentTime.add(Calendar.HOUR_OF_DAY, -birthday.get(Calendar.HOUR_OF_DAY));
        currentTime.add(Calendar.MINUTE, -birthday.get(Calendar.MINUTE));
        currentTime.add(Calendar.SECOND, -birthday.get(Calendar.SECOND));

        return currentTime;
    }

    @Override
    public void printDate(Calendar calendar) {
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + calendar.get(Calendar.MONTH));
        System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hours: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minutes: " + calendar.get(Calendar.MINUTE));
        System.out.println("Seconds: " + calendar.get(Calendar.SECOND));
    }

    @Override
    public long dayDifferences(Date date1, Date date2) {
        long diffInMillies = date2.getTime() - date1.getTime();
        return diffInMillies / (24 * 60 * 60 * 1000);
    }

    @Override
    public String stringToDate(String inputDate) {
        DateFormat format = new SimpleDateFormat("EEE, MMM dd, yyyy kk:mm:ss aaa", Locale.ENGLISH);
        Date date = null;
        try {
            date = format.parse(inputDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        format = new SimpleDateFormat("yyyy-mm-dd");
        return format.format(date);
    }
}
