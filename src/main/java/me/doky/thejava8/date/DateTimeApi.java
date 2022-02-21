package me.doky.thejava8.date;

import java.time.*;

public class DateTimeApi {

    public static void main(String[] args) {

        // 기계적인 시간
        Instant instant = Instant.now();        // 지금시간
        System.out.println(instant);            // 기준시 UTC Universal Time Coordinated , GMT Greenwitch Mean Time
        System.out.println(instant.atZone(ZoneId.of("UTC")));            // 기준시 UTC Universal Time Coordinated , GMT Greenwitch Mean Time

        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);
        ZonedDateTime zonedDateTime = instant.atZone(zone);
        System.out.println(zonedDateTime);

        // 사람용 시간
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime birthDay = LocalDateTime.of(1992, Month.OCTOBER, 24, 0, 0, 9);
        ZonedDateTime nowInKorea = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println(nowInKorea);

        Instant nowInstant = Instant.now();
        ZonedDateTime zonedDateTime1 = nowInstant.atZone(ZoneId.of("Asia/Seoul"));
        System.out.println(zonedDateTime1);



    }

}
