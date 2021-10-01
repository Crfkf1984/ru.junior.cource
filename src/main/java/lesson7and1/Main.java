package lesson7and1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число !");
        int res = scanner.nextInt();
        for (int i = 1; i <= res; i++) {
            int numb = (int) Math.pow(res, i);
            System.out.println(numb);
        }

    }
}
