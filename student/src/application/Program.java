package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        student.name = "Gekko";
        student.grade1 = 27.00;
        student.grade2 = 31.00;
        student.grade3 = 32.00;

        System.out.println("FINAL GRADE do aluno: " + student.name + " Possui " + String.format("%.2f", student.finalGrade()) + " Pontos");


        Student student2 = new Student();
        student2.name = "BrimStone";
        student2.grade1 = 17.00;
        student2.grade2 = 20.00;
        student2.grade3 = 15.00;

        System.out.println("FINAL GRADE do aluno: " + student2.name + " Possui " + String.format("%.2f", student2.finalGrade()) + " Pontos");

        if (student.finalGrade() < 60.0) {
            System.out.println(student.name + " Repetiu de ano ");
            System.out.println("Faltava " + student.missingPoints() + " Pontos para o aluno passar de ano");
        } else {
            System.out.println(student.name + " Passou de Ano");
        }

        if (student2.finalGrade() < 60.0) {
            System.out.println(student2.name + " Repetiu de ano ");
            System.out.println("Faltava " + student2.missingPoints() + " Pontos para o aluno passar de ano");

        } else {

            System.out.println(student2.name + " Passou de Ano");
        }
        sc.close();
    }
}