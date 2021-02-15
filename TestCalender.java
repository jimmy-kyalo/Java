import java.util.*;

public class TestCalender {

    public static void main(String[] args) {
        // construct gregorian calender for current date and time
        Calendar calender = new GregorianCalendar();
        System.out.println("Current time is " + new Date());
        System.out.println("YEAR: " + calender.get(Calendar.YEAR));
        System.out.println("Month: " + calender.get(Calendar.MONTH));
        System.out.println("DATE: " + calender.get(Calendar.DATE));
        System.out.println("HOUR: " + calender.get(Calendar.HOUR));
        System.out.println("HOUR_OF_DAY: " + calender.get(Calendar.HOUR_OF_DAY));
        System.out.println("MINUTE: " + calender.get(Calendar.MINUTE));
        System.out.println("SECOND: " + calender.get(Calendar.SECOND));
        System.out.println("DAY_OF_WEEK: " + calender.get(Calendar.DAY_OF_WEEK));
        System.out.println("DAY_OF_MONTH: " + calender.get(Calendar.DAY_OF_MONTH));
        System.out.println("DAY_OF_YEAR: " + calender.get(Calendar.DAY_OF_YEAR));
        System.out.println("WEEK_OF_MONTH: " + calender.get(Calendar.WEEK_OF_MONTH));
        System.out.println("WEEK_OF_YEAR: " + calender.get(Calendar.WEEK_OF_YEAR));
        System.out.println("AM_PM: " + calender.get(Calendar.AM_PM));
        System.out.println();

        // construct a calender for July 21, 1992
        Calendar calender1 = new GregorianCalendar(1992, 07, 21);
        String[] dayNameOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        System.out.println("July 21, 1992 is a " + dayNameOfWeek[calender1.get(Calendar.DAY_OF_WEEK) - 1]);
    }
}