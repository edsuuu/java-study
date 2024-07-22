package application;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class ConveterDataGlobalParaLocal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        LocalDateTime data01 = LocalDateTime.parse("2024-07-22T01:22:10");
        Instant data02 = Instant.parse("2024-07-22T01:22:10Z");
        Instant data03 = Instant.parse("2024-07-22T01:22:10-03:00");



        sc.close();
    }
}
