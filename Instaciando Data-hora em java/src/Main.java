import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; // form

public class Main {


    public static void main(String[] args) {

        // local date so a data, tem que fazer o => import java.time.LocalDate;
        LocalDate d01= LocalDate.now();

        //local date time tem importa o => import java.time.LocalDateTime
        LocalDateTime d02 = LocalDateTime.now();

        // instante data   tem que importar o => import java.time.Instant;
        Instant d03 = Instant.now();
        //-----------------------------------------------------------------------------------------------------//
        //Texto  ISO 8601 -> DATA-HORA  local data
        LocalDate d04 = LocalDate.parse("2022-10-12"); // => passar o parâmetro

        // local date time
        LocalDateTime d05 = LocalDateTime.parse("2022-10-12T00:41:25"); // => passar o parâmetro

        //Instant
        Instant d06 = Instant.parse("2022-10-12T00:41:25Z"); // Z no final padrão UTC londres , passar parametro

        Instant d07 = Instant.parse("2022-10-12T00:41:25-03:00");//  para ver os  fusos calculo exemplo -03:00
                                                         // ^aqui
        //-------------------------------------------------------------------------------------

        // importa a classe  Date de formatar a data  e hora
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        // texto no formaro customizado =>
        LocalDate d08 = LocalDate.parse("12/10/2022", format1);
        LocalDateTime d09 = LocalDateTime.parse("12/10/2022 01:03", format2);

        LocalDate d10 = LocalDate.of(2022, 10,12);
        LocalDateTime d11 = LocalDateTime.of(2022, 10, 12, 1,32);


        System.out.println("d01 "+d01); // saida terminal => d01 2022-10-12
        System.out.println("d02 "+d02); // saida terminal => d02 2022-10-12T00:23:50.800289672
        System.out.println("d03 "+d03); // saida terminal => d03 2022-10-12T03:23:50.800484810Zd
        System.out.println("d04 "+d04); // saida terminal => d04 2022-10-12
        System.out.println("d05 "+d05); // saida terminal => d05 2022-10-12T00:41:25
        System.out.println("d06 "+d06); // saida terminal => d06 2022-10-12T00:41:25Z
        System.out.println("d07 "+d07); // saida terminal => d07 2022-10-12T03:41:25Z
        System.out.println("d08 "+d08); // saida terminal => d08 2022-10-12
        System.out.println("d09 "+d09); // saida terminal => 09 2022-10-12T01:03
        System.out.println("d10 "+d10); // saida terminal => d010 2022-10-12
        System.out.println("d11 "+d11); //saida terminal => d11 2022-10-12T01:32





    }
}