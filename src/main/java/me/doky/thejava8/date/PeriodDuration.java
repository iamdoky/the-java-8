package me.doky.thejava8.date;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class PeriodDuration {

    public static void main(String[] args) {

        // 날짜를 비교  - 사람용
        LocalDate today = LocalDate.now();
        LocalDate thisYearBirthday = LocalDate.of(2022, Month.OCTOBER, 24);

        Period period = Period.between( today, thisYearBirthday );
        System.out.println(period.getDays());

        Period until = today.until(thisYearBirthday);
        System.out.println(until.get(ChronoUnit.DAYS));

        // 날짜릴 브교 - 기계용
        Instant now = Instant.now();
        Instant plus = now.plus(10, ChronoUnit.SECONDS);
        Duration between = Duration.between(now, plus);
        System.out.println(between);




    }
}
