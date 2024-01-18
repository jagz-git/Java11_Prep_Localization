package org.learning.localeExamples.dateTime;

import java.time.LocalDateTime;

/**
 * Created by Jagadesh Narayanaswamy on 18/01/24.
 * Author comment: Local Date Time usage example
 * <p>
 * Sample Output:
 * Current Date Time: 2024-01-18T20:09:44.825964
 * Day of the month: 18
 * Month: JANUARY
 * Hour: 20
 * Day of the week: THURSDAY
 */
public class LocalDateTimeExample {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current Date Time: " + localDateTime);
        System.out.println("Day of the month: " + localDateTime.getDayOfMonth());
        System.out.println("Month: " + localDateTime.getMonth());
        System.out.println("Hour: " + localDateTime.getHour());
        System.out.println("Day of the week: " + localDateTime.getDayOfWeek());
    }

}
