package modulo11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConverterData{
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.parse("2022-02-15");
        LocalDateTime d2 = LocalDateTime.parse("2022-02-15T01:03:22");
        Instant d3 = Instant.parse("2022-02-15T01:03:22Z");

        LocalDate r1 = LocalDate.ofInstant(d3, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d3, ZoneId.of("Portugal"));

        LocalDateTime r3 = LocalDateTime.ofInstant(d3, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d3, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        System.out.println("d1 dia = " + d1.getDayOfMonth()); //Retorna apenas o dia da data instanciada
        System.out.println("d1 mês = " + d1.getMonthValue()); //Retorna apenas o mês da data instanciada
        System.out.println("d1 ano = " + d1.getYear()); //Retorna apenas o ano da data instanciada
        System.out.println("d1 dia do ano = " + d1.getDayOfYear()); //Retorna o dia do ano, no caso da data em questão é o dia 46 de 365
        System.out.println("d2 hora = " + d2.getHour());
        System.out.println("d2 minuto = " + d2.getMinute());

    }
}