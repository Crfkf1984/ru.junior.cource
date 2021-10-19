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
                String[] rt = word.split(" ");
                int num = Integer.parseInt(rt[1]);
                System.out.println("Дело " + list.get(num) + " заменено на " + word.substring(word.lastIndexOf(" ")));
                list.add(num, word.substring(word.lastIndexOf(" ")));


            } else if (word.startsWith("LIST")) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(i + " - " + list.get(i));
                }

            } else if (word.startsWith("DELETE")) {
                boolean rt = false;
                String[] str  = word.split(" ");
                int anInt = Integer.parseInt(str[1]);
                for (int i = 0; i < list.size(); i++) {
                    if (anInt == i) {
                        System.out.println("Дело " + list.get(i) + " удалено!");
                        list.remove(i);
                        rt = true;
                    }

                    if (!rt) {
                        System.out.println("Дело с таким номером не существует!");
                    }
                }

            } else if (word.startsWith("EXIT")) {
                System.out.println("Вы вышли из программы!");
               res = false;
            }
        }

    }
}
