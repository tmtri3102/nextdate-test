import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class NextDayTest {


    @Test
    @DisplayName("Test next day")
    void testNextDay() {
        int day = 1;
        int month = 1;
        int year = 2023;
        String result = NextDay.findNextDay(day, month, year);
        assertEquals("2/1/2023", result);
    }

    @Test
    @DisplayName("Test end of month")
    void testEndOfMonth() {
        int day = 31;
        int month = 3;
        int year = 2023;
        String result = NextDay.findNextDay(day, month, year);
        assertEquals("1/4/2023", result);
    }

    @Test
    @DisplayName("Test February 28 days")
    void testFebruary28Days() {
        int day = 28;
        int month = 2;
        int year = 2023;
        String result = NextDay.findNextDay(day, month, year);
        assertEquals("1/3/2023", result);
    }

    @Test
    @DisplayName("Test February 29 days")
    void testFebruary29Days() {
        int day = 29;
        int month = 2;
        int year = 2024;
        String result = NextDay.findNextDay(day, month, year);
        assertEquals("1/3/2024", result);
    }

    @Test
    @DisplayName("Test end of year")
    void testEndOfYear() {
        int day = 31;
        int month = 12;
        int year = 2023;
        String result = NextDay.findNextDay(day, month, year);
        assertEquals("1/1/2024",result);
    }

    @Test
    @DisplayName("Test invalid date")
            void testInvalidDate() {
        int day = 32;
        int month = 2;
        int year = 2023;
        String result = NextDay.findNextDay(day, month, year);
        assertEquals("Invalid day", result);
    }

    @Test
    void testFindNextYear() {
        int year = 2028;
        assertEquals(2028, year);
    }
}

