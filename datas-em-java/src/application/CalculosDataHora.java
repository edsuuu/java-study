package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class CalculosDataHora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        LocalDate data01 = LocalDate.parse("2024-07-22");
        LocalDateTime data02 = LocalDateTime.parse("2024-07-22T01:22:10");
        Instant data03 = Instant.parse("2024-07-22T01:22:10Z");

        LocalDate removerSeteDiasdata01 = data01.minusDays(7);
        LocalDate proximaSemanadata01 = data01.plusDays(7);
        LocalDate adicionarAnosdata01 = data01.plusYears(7);

        System.out.println("removerSeteDias " + removerSeteDiasdata01);
        System.out.println("proximaSemana " + proximaSemanadata01);
        System.out.println("adicionarAnos " + adicionarAnosdata01);


        LocalDateTime removerSeteDiasdata02 = data02.minusDays(7);
        LocalDateTime proximaSemanadata02 = data02.plusDays(7);
        LocalDateTime adicionarAnosdata02 = data02.plusYears(7);


        System.out.println("removerSeteDias " + removerSeteDiasdata02);
        System.out.println("proximaSemana " + proximaSemanadata02);
        System.out.println("adicionarAnos " + adicionarAnosdata02);

        Instant removerSeteDiasdata03 = data03.minus(7, ChronoUnit.DAYS);
        Instant proximaSemanadata03 = data03.plus(7, ChronoUnit.DAYS);


        System.out.println("removerSeteDias " + removerSeteDiasdata03);
        System.out.println("proximaSemana " + proximaSemanadata03);

        //calcular tempo

        Duration tempo1 = Duration.between(removerSeteDiasdata01.atTime(0, 0), data01.atTime(0, 0));
        Duration tempo2 = Duration.between(removerSeteDiasdata01.atStartOfDay(), data01.atStartOfDay());
        Duration tempo3 = Duration.between(removerSeteDiasdata01.atStartOfDay(), data01.atStartOfDay());


        System.out.println("tempo1 = " + tempo1.toDays());
        System.out.println("tempo2 = " + tempo2.toDays());

        sc.close();
    }
}
