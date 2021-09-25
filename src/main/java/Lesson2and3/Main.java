package Lesson2and3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double Dollars = 73.3, Euro = 85.68;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму в рублях!");
        double numb = scanner.nextDouble();
        System.out.println("Сумма в долларах составляет!");
        Dollars = Dollars / numb;
        System.out.println(Dollars);
        System.out.println("Сумма в евро составляет!");
        Euro = Euro / numb;
        System.out.println(Euro);

    }
}
