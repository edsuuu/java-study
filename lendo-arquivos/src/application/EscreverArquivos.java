package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscreverArquivos {
    public static void main(String[] args) {
        String[] lines = new String[]{"Good morning", "Good afternoon", "Good night"};
        String path = "C:\\Windows\\Temp\\out.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("File created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

