package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Locale;
import java.util.Scanner;

public class ConveterDataGlobalParaLocal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        LocalDateTime data01 = LocalDateTime.parse("2024-07-22T01:22:10");
        LocalDate data02 = LocalDate.parse("2024-07-22");
        Instant data03 = Instant.parse("2024-07-22T01:22:10Z");

//        for (String s: ZoneId.getAvailableZoneIds()) {
//            System.out.println(s)
        // todas as zonas de datas
//        }

        LocalDate convert1 = LocalDate.ofInstant(data03, ZoneId.systemDefault());
        LocalDate convert2 = LocalDate.ofInstant(data03, ZoneId.of("Portugal"));
        LocalDateTime convert3 = LocalDateTime.ofInstant(data03, ZoneId.systemDefault());
        LocalDateTime convert4 = LocalDateTime.ofInstant(data03, ZoneId.of("Portugal"));


        System.out.println(convert1);
        System.out.println(convert2);
        System.out.println(convert3);
        System.out.println(convert4);

        System.out.println("dia da data02 = " + data02.getDayOfMonth());
        System.out.println("mes da data02 = " + data02.getMonthValue());
        System.out.println("ano da data02 = " + data02.getYear());

        System.out.println("dia da data01 = " + data01.getDayOfMonth());
        System.out.println("mes da data01 = " + data01.getMonthValue());
        System.out.println("ano da data01 = " + data01.getYear());
        System.out.println("Hora da data01 = " + data01.getHour());
        System.out.println("minutos da data01 = " + data01.getMinute());



        sc.close();
    }
}
