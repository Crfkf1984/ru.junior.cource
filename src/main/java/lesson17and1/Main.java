package lesson17and1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean res = true;

        while (res) {
            System.out.println("Введите команду!");
            String word = scanner.nextLine();

            if (word.startsWith("ADD")) {
                list.add(word.substring(word.indexOf(" ")).trim());
                System.out.println("Добавлено дело " + word.substring(word.indexOf(" ")));

            } else if (word.startsWith("EDIT")) {
                int num = Integer.parseInt(word.replaceAll("[A-z]+", "").trim());
                String str = word.replaceAll("\\d+", "").trim();
                System.out.println("Дело " + list.get(num) + " заменено на " + str.substring(str.indexOf(" ")).trim());
                list.remove(num);
                list.add(num, str.substring(str.indexOf(" ")).trim());


            } else if (word.startsWith("LIST")) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(i + " - " + list.get(i));
                }

            } else if (word.startsWith("DELETE")) {
                boolean rt = false;
                int anInt = Integer.parseInt(word.replaceAll("[A-z]+", "").trim());
                for (int i = 0; i < list.size(); i++) {
                    if (anInt == i) {
                        System.out.println("Дело " + list.get(i) + " удалено!");
                        list.remove(i);
                        rt = true;
                    }

                }

                if (!rt) {
                    System.out.println("Дело с таким номером не существует!");
                }

            } else if (word.startsWith("EXIT")) {
                System.out.println("Вы вышли из программы!");
               res = false;
            }
        }

    }
}
