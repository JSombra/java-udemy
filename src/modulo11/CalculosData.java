package modulo11;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosData{
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.parse("2022-02-15");
        LocalDateTime d2 = LocalDateTime.parse("2022-02-15T01:03:22");
        Instant d3 = Instant.parse("2022-02-15T01:03:22Z");

        LocalDate pastWeekLocalDate = d1.minusDays(7);
        LocalDate nextWeekLocalDate = d1.plusDays(7);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d2.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d2.plusHours(88);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d3.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d3.plus(7, ChronoUnit.HOURS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d1.atStartOfDay()); //atStartOfDay() seta o valor de 00:00 em uma data LocalDate sem o Time.
        Duration t2 = Duration.between(d2, nextWeekLocalDateTime);
        Duration t3 = Duration.between(pastWeekInstant, d3);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toHours());
        System.out.println("t3 dias = " + t3.toDays());

    }
}