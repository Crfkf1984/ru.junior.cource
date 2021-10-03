package lesson7and4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean res = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число которое хотите найти!");
        int enter = scanner.nextInt();
        int[] numb = new int[10];
        numb[0] = 1;
        numb[1] = 2;
        numb[2] = 3;
        numb[3] = 4;
        numb[4] = 5;
        numb[5] = 6;
        numb[6] = 7;
        numb[7] = 8;
        numb[8] = 9;
        numb[9] = 10;

        for (int i = 0; i < numb.length; i++) {
            if (numb[i] == enter) {
                System.out.println("Ваше значение найдено " + numb[i] + " оно находится в массиве в ячейке " + i);
                res = true;
            }
        }

        if (!res) {
            System.out.println(-1);
        }
    }
}
