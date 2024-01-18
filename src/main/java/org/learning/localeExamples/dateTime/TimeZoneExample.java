package org.learning.localeExamples.dateTime;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by Jagadesh Narayanaswamy on 18/01/24.
 * Author comment: Time Zone Example
 */
public class TimeZoneExample {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        TimeZone localTimeZone = TimeZone.getDefault();
        System.out.println("Current date: " + localDateTime);
        System.out.println("Time Zone: " + localTimeZone.getDisplayName());

        /* Ignore this code
        Locale locale = new Locale("en", "INDIA");
        Locale.setDefault(locale);
        System.out.println("Updated Time Zone: " + localTimeZone.getDisplayName(locale));
        System.out.println("Current date: " + localDateTime);
        */

        System.out.println("---------------------------------------------------------------");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Zoned Date Time: " + zonedDateTime.toString());
        System.out.println("Date Time: " + zonedDateTime.toLocalDateTime());
        System.out.println("Day of Month: " + zonedDateTime.toLocalDateTime().getDayOfMonth());
    }

}
