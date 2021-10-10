package lesson13and2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО");
        String fio = scanner.nextLine();

        if (fio.matches("[а-яА-Я,\\s]+")) {
            String[] res = fio.split(" ");
            if (res.length == 3) {
                System.out.println("Фамилия : " + res[0] + "\n"
                        + "Имя : " + res[1] + "\n" + "Отчество : " + res[2]);
            } else {
                System.out.println("Введенная строка не является Ф.И.О");
            }
        } else {
            System.out.println("Вы ввели недопустимый символ в ФИО!");
        }

    }
}
