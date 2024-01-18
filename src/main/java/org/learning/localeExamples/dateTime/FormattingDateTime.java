package org.learning.localeExamples.dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Jagadesh Narayanaswamy on 18/01/24.
 * Author comment: Formatting Date Time
 * <p>
 * Sample Output:
 * Date Time: 2024-01-18T20:16:30.578543
 * Default Format Date Time: 18-Jan-2024 20:16:30.578
 */
public class FormattingDateTime {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Date Time: " + localDateTime);
        String pattern = "dd-MMM-yyyy HH:mm:ss.SSS";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        String formattedDateTime = localDateTime.format(dateTimeFormatter);
        System.out.println("Default Format Date Time: " + formattedDateTime);
    }

}
