package lesson17and1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        final String ADD = "ADD";
        final String EDIT = "EDIT";
        final String DELETE = "DELETE";
        final String EXIT = "EXIT";
        final String LIST = "LIST";
        //List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean res = true;

        while (res) {
            System.out.println("Введите команду!");
            String word = scanner.nextLine();

            if (word.startsWith(ADD)) {
                add(word);

            } else if (word.startsWith(EDIT)) {
                edit(word);

            } else if (word.startsWith(LIST)) {
                List<String> rs = list(word);

                for (int i = 0; i < rs.size(); i++) {
                    System.out.println(i + " - " + rs.get(i));
                }

            } else if (word.startsWith(DELETE)) {
                delete(word);

            } else if (word.startsWith(EXIT)) {
                exit(word);
                res = false;
            }
        }

    }

    public static void add(String word) {
        list.add(word.substring(word.indexOf(" ")).trim());
        String todo = word.substring(word.indexOf(" "));
        System.out.println("Добавлено дело " + todo);
    }

    public static void edit(String word) {
        String[] str = word.split(" ");
        int num = Integer.parseInt(str[1]);

        for (int i = 0; i < list.size(); i++) {
            if (num == i) {
                String result = "";
                for (int j = 2; j < str.length; j++) {
                    result += str[j] + " ";
                }
                System.out.println("Дело " + list.get(num) + " заменено на " + result);
                list.remove(num);
                list.add(num, result);
            }
        }
    }

    public static List<String> list(String word) {
        List<String> str = new ArrayList<>();
        if (list.size() == 0) {
            System.out.println("В данном списке пока ничего нет!");
        } else {
            for (int i = 0; i < list.size(); i++) {
                str.add(list.get(i));
            }
        }
        return str;
    }

    public static void delete(String word) {
        String[] str  = word.split(" ");
        int anInt = Integer.parseInt(str[1]);
        for (int i = 0; i < list.size(); i++) {
            if (anInt == i) {
                System.out.println("Дело " + list.get(i) + " удалено!");
                list.remove(i);
            }
        }
    }

    public static void exit(String word) {
        System.out.println("Вы вышли из программы!");
    }
}
