import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");


        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        // time zone global e convert pra time zone  local
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault() );


        System.out.println("d04 = " + d04.format(fmt1)); // => d04 = 20/07/2022
        // ou podemos fazer assim
        System.out.println("d04 = " + fmt1.format(d04)); // => d04 = 20/07/2022
        // putro forma e; e sssa forma e melhor pelo garbage colector
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) ); // => d04 = 20/07/2022

        //fmt2
        System.out.println("d05 = " + d05.format(fmt1));
        System.out.println("d05 = " + d05.format(fmt2)); // => d05 = 20/07/2022 01:30

        // time zone local
        System.out.println("d06 = " + fmt3.format(d06)); // => d06 = 19/07/2022 22:30





    }
}