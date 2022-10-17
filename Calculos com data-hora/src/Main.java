import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args){
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        //------------------LOCALDATE-----------------------------------------------//
        LocalDate semanaPassada = d04.minusDays(7);
        LocalDate semanaQuevem = d04.plusDays(7);

        //--------------------------------LOCALDATETIME------------------------------//
        LocalDateTime semanaPassadaTime = d05.minusDays(7);
        LocalDateTime semanaQuevemTime = d05.plusDays(7);


        //----------------------INSTANT----------------------------------------------//
        Instant semanaPassadaIstant = d06.minus(7, ChronoUnit.DAYS);
        Instant semanaQuevemTimeInstat = d06.plus(7, ChronoUnit.DAYS);

        //--------------------------------------------------------------------------//
        System.out.println("Semenda passada = " + semanaPassada); // => Semenda passada = 2022-07-13
        System.out.println("Semenda que vem  = " + semanaQuevem); // => Semenda que vem  = 2022-07-27
        System.out.println();

        //--------------------------------------------------------------------------//
        System.out.println("Semenda passada = " + semanaPassadaTime); // => 2022-07-13T01:30:26
        System.out.println("Semenda que vem  = " + semanaQuevemTime);// => 2022-07-27T01:30:26
        System.out.println();

        //---------------------------------------------------------------------------------//
        System.out.println("Semenda passada = " + semanaPassadaIstant); // => 2022-07-13T01:30:26Z
        System.out.println("Semenda que vem  = " + semanaQuevemTimeInstat);// => 2022-07-27T01:30:26Z

        //--------------------------------------------------------------------------------------//
        // para calcula tempo de uma dadta pra outra use o Duration TEM QUE IMPORTA  A CLASSE import java.time.Duration;
        // Duratio e a durção entre duas data horas 
        Duration t1 = Duration.between( semanaPassada.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between( semanaPassadaTime, d05);
        Duration t3 = Duration.between( semanaPassadaIstant, d06);
        Duration t4 = Duration.between( d06, semanaPassadaIstant); //


        System.out.println("t1 dias = " + t1.toDays()); // => t1 dias = 7
        System.out.println("t2 dias = " + t2.toDays()); // => t2 dias = 7
        System.out.println("t3 dias = " + t3.toDays()); // => t3 dias = 7
        System.out.println("t4 dias = " + t4.toDays()); // => t4 dias = -7


    }


}