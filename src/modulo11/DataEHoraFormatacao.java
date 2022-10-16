package modulo11;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataEHoraFormatacao {
    public static void main(String[] args) {
        //Instanciando as datas que serão usadas
        LocalDate d1 = LocalDate.parse("2022-02-15");
        LocalDateTime d2 = LocalDateTime.parse("2022-02-15T01:03:22");
        Instant d3 = Instant.parse("2022-02-15T23:03:22Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        //Ou pode ser usado o ISO_INSTANT
        DateTimeFormatter fmt2 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("d1 = " + d1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("d2 = " + d2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        System.out.println("d2 = " + d2.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("d3 = " + fmt1.format(d3));
    }
}
