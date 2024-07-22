package application;

import javax.xml.crypto.Data;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        DateTimeFormatter formate1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formate2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // data local da maquina
        LocalDate data01 = LocalDate.now();

        // data local da maquina com horas
        LocalDateTime data02 = LocalDateTime.now();

        // data global da maquina com horas Londres
        Instant data03 = Instant.now();

        LocalDate data04 = LocalDate.parse("2024-07-22");

        LocalDateTime data05 = LocalDateTime.parse("2024-07-22T01:22:10");

        Instant data06 = Instant.parse("2024-07-22T01:22:10Z");

        Instant data07 = Instant.parse("2024-07-22T01:22:10-03:00");

        LocalDate data08 = LocalDate.parse("22/07/2024", formate1);
        //ou a opcao de baixo
        LocalDate data01111 = LocalDate.parse("22/07/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        LocalDateTime data09 = LocalDateTime.parse("22/07/2024 01:00", formate2);

        LocalDate data10 = LocalDate.of(2022, 7,20);
        LocalDateTime data11 = LocalDateTime.of(2022, 7,20, 1, 30, 22);

        System.out.println(data01);
        System.out.println(data02);
        System.out.println(data03);
        System.out.println(data04);
        System.out.println(data05);
        System.out.println(data06);
        System.out.println(data07);
        System.out.println(data08);
        System.out.println(data09);
        System.out.println(data01111);
        System.out.println(data10);
        System.out.println(data11);


        sc.close();
    }
}
