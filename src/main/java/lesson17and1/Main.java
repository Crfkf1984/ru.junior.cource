package lesson17and1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<String> list = new ArrayList<>();
    private static final String ADD = "ADD";
    private static final String EDIT = "EDIT";
    private static final String DELETE = "DELETE";
    private static final String EXIT = "EXIT";
    private static final String LIST = "LIST";

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
                list();

            } else if (word.startsWith(DELETE)) {
                remove(word);

            } else if (word.startsWith(EXIT)) {
                exit();
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
        String[] str = word.split(" ", 3);
        int num = Integer.parseInt(str[1]);


        if (list.size() < num) {
            return;
        }
        String todo = str[2];
        System.out.println("Дело " + list.get(num) + " заменено на " + todo);
        list.set(num, todo);
    }

    public static void list() {
        if (list.size() == 0) {
            System.out.println("В данном списке пока ничего нет!");
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(i + " - " + list.get(i));
            }
        }
    }

    public static void remove(String word) {
        String[] str = word.split(" ");
        int anInt = Integer.parseInt(str[1]);

        if (anInt > list.size()) {
            System.out.println("ERROR");
            return;
        }
        System.out.println("Дело " + list.get(anInt) + " удалено!");
        list.remove(anInt);
    }

    public static void exit() {
        System.out.println("Вы вышли из программы!");
    }
}
