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

        // Increment the day
        day++;

        // Check if we need to roll over to the next month
        if (day > daysInMonth[month - 1]) {
            day = 1; // Reset day to 1
            month++; // Increment month

            // Check if we need to roll over to the next year
            if (month > 12) {
                month = 1; // Reset month to January
                year++; // Increment year
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
//        boolean check = true;
//        do {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter date: ");
//            check = false;
//        }
//        Scanner in = new Scanner(System.in);
//        int dateInput;
//        int monthInput;
//        int yearInput;
//        while(true){
//            System.out.print("Enter date: ");
//            dateInput = in.nextInt();
////            System.out.print("Enter month: ");
////            monthInput = in.nextInt();
////            System.out.print("Enter year: ");
////            yearInput = in.nextInt();
//
//        }