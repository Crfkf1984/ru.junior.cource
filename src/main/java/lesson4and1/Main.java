package lesson4and1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первый возраст!");
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        System.out.println("Введите второй возраст!");
        int two = scanner.nextInt();
        System.out.println("Введите третий возраст!");
        int three = scanner.nextInt();
        int[] numb = new int[3];
        numb[0] = one;
        numb[1] = two;
        numb[2] = three;

        if ((one == two) || (one == three) || three == two) {
            System.out.println("Вы ввели одинаковый возраст это не допустимо!");
        } else {

            int max = one > two ? Math.max(one, three) : Math.max(two, three);
            System.out.println("Это наибольший возраст! " + max);
            int min = one < two ? Math.min(one, three) : Math.min(two, three);
            System.out.println("Это наименьший возраст! " + min);

            for (int i = 0; i < numb.length - 1; i++) {
                if (max != numb[i] && min != numb[i]) {
                    System.out.println("Это средний возраст! " + numb[i]);
                }
            }
        }

    }
}
