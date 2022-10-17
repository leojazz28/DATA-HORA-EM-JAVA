import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant( d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); // passando emtre aspas o time zone ex portugal
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        //for (String s : ZoneId.getAvailableZoneIds()) { com esse for esultado de todos time zone em java
        //    System.out.println(s);
        //}

        System.out.println("r1 = " + r1); // => 2022-07-19
        System.out.println("r2 = " + r2); // => 2022-07-20
        System.out.println("r3 = " + r3); // => 2022-07-19T22:30:26
        System.out.println("r4 = " + r4); // => 2022-07-20T02:30:26

        System.out.println("d04 dia = " + d04.getDayOfMonth()); // mostra o dia => d04 dia = 20
        System.out.println("d04 mes = " + d04.getMonthValue()); // mostar o mes => d04 mes = 7
        System.out.println("d04 mes = " + d04.getYear()); // mostar o ano =>  d04 mes = 2022

        System.out.println("d05 hora = " + d05.getHour()); // mosta a hora  => d05 hora = 1
        System.out.println("d05 minutos = " + d05.getMinute()); // mosta os minutos => d05 hora = 30






    }
}