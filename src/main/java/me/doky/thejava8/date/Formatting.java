package me.doky.thejava8.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Formatting {

    public static void main(String[] args) {

        Date date = new Date();
        Instant instant = date.toInstant();
        Date newDate = Date.from(instant);

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        LocalDateTime dateTime = gregorianCalendar.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        ZonedDateTime zonedDateTime = gregorianCalendar.toInstant().atZone(ZoneId.systemDefault());
        GregorianCalendar.from(zonedDateTime);

        ZoneId zoneId = TimeZone.getTimeZone("PST").toZoneId();
        TimeZone zone = TimeZone.getTimeZone(zoneId);

        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = dateTime1.plus(10, ChronoUnit.DAYS);
        System.out.println(dateTime2.getDayOfMonth());

        // LocaDate TIme 을 문자열 또는 출력할떄
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter MMddyyyy = DateTimeFormatter.ofPattern("MM/dd/yyyy");     // ofPattern 을 사용하여 정의하여 사용가능하다.
        System.out.println(now.format(MMddyyyy));

        LocalDate p = LocalDate.parse("02/14/1997", MMddyyyy);
        System.out.println(p);




    }

}
