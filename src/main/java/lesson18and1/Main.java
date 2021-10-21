package lesson18and1;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    private static Set<String> emailList = new TreeSet<>();
    private static final String ADD = "ADD";
    private static final String LIST = "LIST";
    private static final String EXIT = "EXIT";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean rt = true;
        while (rt = true) {
            System.out.println("Введите команду!");
            String word = scanner.nextLine();
            if (word.startsWith(ADD)) {

                add(word);

            } else if (word.startsWith(LIST)) {

                list();

            } else if (word.startsWith(EXIT)) {

                exit();
                rt = false;
            }
        }
    }

    public static void add(String word) {
        boolean tu = false;
        String[] res = word.split(" ");
        if (res[1].matches("([A-z]+\\d+@.+\\.(ru|com))")) {
            emailList.add(res[1]);
            System.out.println("Ваша почта успешно добавлена!");
            tu = true;
        }

        if (!tu) {

            System.out.println("Вы ввели некорректный электронный адрес!");
        }

    }

    public static void list() {

       emailList.forEach(System.out::println);
    }

    public static void exit() {
        System.out.println("Вы вышли из программы!");
    }
}
