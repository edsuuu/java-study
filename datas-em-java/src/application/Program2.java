package application;

import javax.xml.crypto.Data;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        DateTimeFormatter formate1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formate2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formate3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        LocalDate data01 = LocalDate.parse("2024-07-22");
        LocalDateTime data02 = LocalDateTime.parse("2024-07-22T01:22:10");
        Instant data03 = Instant.parse("2024-07-22T01:22:10Z");


        System.out.println(data01.format(formate1));
        System.out.println(data02.format(formate2));
        System.out.println(formate3.format(data03)); // para instant ou outro


        sc.close();
    }
}
