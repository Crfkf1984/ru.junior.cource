package lesson24and1;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    private static final String LIST = "LIST";
    private static final String EXIT = "EXIT";
    private static final Map<String, String> map = new TreeMap<>();

    public static void main(String[] args) {
        boolean rt = true;
        Scanner scanner = new Scanner(System.in);

        while (rt) {

            System.out.println("Введите номер, имя или команду!");
            String word = scanner.nextLine();

            if (word.matches("^[А-я]+$")) {
                name(word, scanner);
            }
            if (word.matches("\\d+")) {
                telNum(word, scanner);
            }

            if (word.startsWith(LIST)) {
                list();
            }
            if (word.startsWith(EXIT)) {
                exit();
                rt = false;
            }

        }

    }

    public static void name(String word, Scanner scanner) {
        if (map.size() > 0) {
            for (Map.Entry<String, String> key : map.entrySet()) {
                if (word.equals(key.getKey())) {
                    String name = key.getKey();
                    String tel = key.getValue();
                    System.out.println(name + " - " + tel.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})"
                            , "+7 ($2) $3 $4 - $5"));
                } else {
                    System.out.println("Такого имени в телефонной книге нет!");
                    System.out.println("Введите номер телефона для абонента " + word);
                    String tel = scanner.nextLine();
                    map.put(word, tel);
                    System.out.println("Контакт сохранен!");
                }
            }

        } else if (map.size() == 0) {

            System.out.println("Такого имени в телефонной книге нет!");
            System.out.println("Введите номер телефона для абонента " + word);
            String tel = scanner.nextLine();
            map.put(word, tel);
            System.out.println("Контакт сохранен!");
        }
    }

    public static void telNum(String word, Scanner scanner) {
        if (map.size() > 0) {
            for (Map.Entry<String, String> tel : map.entrySet()) {
                if (word.equals(tel.getValue())) {
                    String name = tel.getKey();
                    String num = tel.getValue();
                    System.out.println(name + " - " + num.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})"
                            , "+7 ($2) $3 $4 - $5"));
                } else {
                    System.out.println("Такого номера нет в телефонной книге!");
                    System.out.println("Введите имя абонента для номера " + word);
                    String name = scanner.nextLine();
                    map.put(name, word);
                    System.out.println("Контакт сохранен!");
                }
            }
        } else if (map.size() == 0) {
            System.out.println("Такого номера нет в телефонной книге!");
            System.out.println("Введите имя абонента для номера " + word);
            String name = scanner.nextLine();
            map.put(name, word);
            System.out.println("Контакт сохранен!");
        }
    }

    public static void list() {
        for (Map.Entry<String, String> res : map.entrySet()) {
            String name = res.getKey();
            String tel = res.getValue();
            System.out.println(name + " - " + tel.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})"
                    , "+7 ($2) $3 $4 - $5"));

        }
    }

    public static void exit() {
        System.out.println("Вы вышли из программы!");
    }
}
