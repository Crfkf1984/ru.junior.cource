package Lesson2and2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double C =0, F;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение температуры!");
        double numb = scanner.nextDouble();
        C = numb;
        System.out.println("Ваш результат по фаренгейту!");
        F = C * 1.8 + 32;
        System.out.println(F);
    }
}
