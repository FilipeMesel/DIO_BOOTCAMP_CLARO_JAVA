import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        System.out.println("");
        /**
         * Instanciação de dadta-hora local
         */
        LocalDate d01 = LocalDate.now();
        LocalTime t01 = LocalTime.now();
        LocalDateTime dt01 = LocalDateTime.now();
        Instant i01 = Instant.now();
        /**
         * Instanciação de dadta-hora local com parse
         */
        LocalDate d02 = LocalDate.parse("2024-07-30");
        LocalDateTime dt02 = LocalDateTime.parse("2024-07-30T03:55:33.929");
        Instant i02 = Instant.parse("2024-07-30T03:55:33.929Z");
        OffsetDateTime odt = OffsetDateTime.parse("2024-07-30T03:55:33.929-03:00");
        Instant i03 = odt.toInstant();

        System.out.println(d01);
        System.out.println(t01);
        System.out.println(dt01);
        System.out.println(i01);
        System.out.println(d02);
        System.out.println(dt02);
        System.out.println(i02);
        System.out.println(i03); //-03 é o fuso horario!

        /*Formatação */
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        //Fuso horario do pc do usuário
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        LocalDate d03 = LocalDate.parse("30/07/2024", fmt1);
        LocalDateTime dt03 = LocalDateTime.parse("30/07/2024 03:24", fmt2);
        Instant i04 = Instant.parse("2024-07-30T03:55:33.929Z");
        Instant i05 = Instant.now();
        System.out.println(d03);
        System.out.println(dt03);

        /**
         * Converção para texto
         */
        System.out.println(d03.format(fmt1));
        System.out.println(dt03.format(fmt2));
        System.out.println(fmt3.format(i04));
        System.out.println(fmt3.format(i05));

        /*Operações */
        LocalDate d05 = d02.minusDays(7);
        System.out.println(d05);
        LocalDate d06 = d02.plusDays(7);
        System.out.println(d06);

    }
}
