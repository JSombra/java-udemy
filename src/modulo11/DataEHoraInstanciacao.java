package modulo11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataEHoraInstanciacao {
    public static void main(String[] args) {

        LocalDate d1 = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.now();
        Instant d3 = Instant.now();
        LocalDate d4 = LocalDate.parse("2022-01-01");
        LocalDateTime d5 = LocalDateTime.parse("2022-01-01T01:30:26");
        Instant d6 = Instant.parse("2022-02-15T01:30:26Z");
        Instant d7 = Instant.parse("2022-02-15T01:30:26-03:00");
        LocalDate d8 = LocalDate.parse("15/02/2019", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime d9 = LocalDateTime.parse("15/02/2019 03:02", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        LocalDateTime d10 = LocalDateTime.of(2022, 02, 15, 22, 02);


        System.out.println("LocalDate.now(): " + d1);
        System.out.println("LocalDateTime.now(): " + d2);
        System.out.println("Instant.now(): " + d3);
        System.out.println("LocalDate.Parse(): " + d4);
        System.out.println("LocalDateTime.Parse(): " + d5);
        System.out.println("Instant.Parse(): " + d6);
        System.out.println("Instant.Parse(): " + d7);
        System.out.println("LocalDate.Parse(): " + d8);
        System.out.println("LocalDateTime.Parse(): " + d9);
        System.out.println("LocalDateTime.of(): " + d10);


    }
}
