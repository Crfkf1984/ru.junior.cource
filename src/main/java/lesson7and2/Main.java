package lesson7and2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число!");
        int numb = scanner.nextInt();
        for (int i = 0; i <= numb; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
        }
    }
}
