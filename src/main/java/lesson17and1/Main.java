package lesson17and1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<String> list = new ArrayList<>();
    static final String ADD = "ADD";
    static final String EDIT = "EDIT";
    static final String DELETE = "DELETE";
    static final String EXIT = "EXIT";
    static final String LIST = "LIST";

    public static void main(String[] args) {
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
                    list(word);

            } else if (word.startsWith(DELETE)) {
                remove(word);

            } else if (word.startsWith(EXIT)) {
                exit(word);
                res = false;
            }
        }

    }

    public static void add(String word) {
        String todo = word.substring(word.indexOf(" "));
        list.add(todo);
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
                list.set(num, result);
            }
        }
    }

    public static void list(String word) {
        List<String> str = new ArrayList<>();
        if (list.size() == 0) {
            System.out.println("В данном списке пока ничего нет!");
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(i + " - " + list.get(i));
            }
        }
    }

    public static void remove(String word) {
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
