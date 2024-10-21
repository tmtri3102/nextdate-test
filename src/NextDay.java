import java.util.Scanner;

public class NextDay {
    public static String findNextDay(int day, int month, int year) {
        int[] daysInMonth = { 31, (isLeapYear(year) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Check for valid month
        if (month < 1 || month > 12) {
            return "Invalid month";
        }

        // Check for valid day
        if (day < 1 || day > daysInMonth[month - 1]) {
            return "Invalid day";
        }


        day++;

        // Neu 32 > 31 thang 3 ==> 1 thang 4
        if (day > daysInMonth[month - 1]) {
            day = 1;
            month++;

            // Neu thang 12++ = 13 => 1 thang 1
            if (month > 12) {
                month = 1;
                year++;
            }
        }

        return day + "/" + month + "/" + year;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int findNextYear(int year) {
        return year + 1;
    }
}