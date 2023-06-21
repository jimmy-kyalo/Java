import java.util.Scanner;

public class PrintCalender {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prompt user to enter year
        System.out.print("Enter full year: ");
        int year = scanner.nextInt();

        // prompt user to enter month
        System.out.print("Enter month number(1 - 12): ");
        int month = scanner.nextInt();
        // print calender for the month and year
        printMonth(year, month);
        scanner.close();
    }

    public static void printMonth(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }

    public static void printMonthTitle(int year, int month) {
        System.out.println("        " + getMonthName(month) + " " + year);
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static void printMonthBody(int year, int month) {
        // get start day of the week for 1st date in the month
        int startDay = getStartDay(year, month);
        // get no of days in the month
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        // pad space b4 first day of month
        int i = 0;
        for (i = 0; i < startDay; i++)
            System.out.print("    ");

        for (i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);
            if ((i + startDay) % 7 == 0)
                System.out.println();
        }
        System.out.println();

    }

    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
        }
        return monthName;
    }

    public static int getStartDay(int year, int month) {
        final int START_DAY_JAN_1_1800 = 3;
        // get total no of days from 1/1/1800 to month/1/year
        int totalNumberOfDays = getTotalNumberOfDays(year, month);
        // return start day for month/1/year
        return (totalNumberOfDays + START_DAY_JAN_1_1800) % 7;
    }

    public static int getTotalNumberOfDays(int year, int month) {
        int total = 0;
        // get total days from 1800 to 1/1/year
        for (int i = 1800; i < year; i++) {
            if (isLeapYear(i))
                total += 366;
            else
                total += 365;
        }
        // add days from jan to month prior to the calender month
        for (int i = 1; i < month; i++)
            total += getNumberOfDaysInMonth(year, i);
        return total;
    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        if (month == 2)
            return isLeapYear(year) ? 29 : 28;
        return 0;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}