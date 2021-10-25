package lesson24and1;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    private static final String LIST = "LIST";
    private static final String EXIT = "EXIT";
    private static Map<String, String> map = new TreeMap<>();

    public static void main(String[] args) {
        boolean istrue = true;
        Scanner scanner = new Scanner(System.in);

        while (istrue) {

            System.out.println("Введите номер, имя или команду!");
            String word = scanner.nextLine();

            if (word.matches("^[А-я]+$")) {
                name(word);
            }
            if (word.matches("\\d+")) {
                telNum(word);
            }

            if (word.startsWith(LIST)) {
                list();
            }
            if (word.startsWith(EXIT)) {
                exit();
                istrue = false;
            }

            if (word.matches("[!,&?А-я]+") || word.matches("[!,&?\\d]+")) {
                System.out.println("Вы ввели недопустимый формат в " + word);
            }

        }

    }

    public static void name(String word) {
        Scanner res = new Scanner(System.in);
        if (map.size() > 0) {
            String tel = "";
            for (Map.Entry<String, String> key : map.entrySet()) {
                if (word.equals(key.getKey())) {
                    String name = word;
                    tel = key.getValue();
                    System.out.println(name + " - " + tel.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})"
                            , "+7 ($2) $3 $4 - $5"));
                    return;
                }
            }

            System.out.println("Такого имени в телефонной книге нет!");
            System.out.println("Введите номер телефона для абонента " + word);
            tel = res.nextLine().replaceAll("\\D", "").trim();
            if (map.containsValue(tel)) {
                System.out.println("Данный номер телефона уже занят другим абонентом!");
                return;
            }
            if (tel.length() == 11) {
                map.put(word, tel);
                System.out.println("Контакт сохранен!");
            } else {
                System.out.println("Вы ввели неполный телефонный номер!");
            }

        } else {

            System.out.println("Такого имени в телефонной книге нет!");
            System.out.println("Введите номер телефона для абонента " + word);
            String tel = res.nextLine().replaceAll("\\D", "").trim();
            if (tel.length() == 11) {
                map.put(word, tel.replaceAll("\\D", ""));
                System.out.println("Контакт сохранен!");
            } else {
                System.out.println("Вы ввели неполный телефонный номер!");
            }

        }
    }

    public static void telNum(String word) {
        Scanner res = new Scanner(System.in);
        if (map.size() > 0) {

            for (Map.Entry<String, String> tel : map.entrySet()) {
               if (word.replaceAll("\\D", "").trim().length() < 11) {
                   System.out.println("Вы ввели неполный номер телефона!");
                   return;
               }
                if (word.equals(tel.getValue())) {
                    String name = word;
                    String num = tel.getValue();
                    System.out.println(name + " - " + num.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})"
                            , "+7 ($2) $3 $4 - $5"));
                    return;
                }
            }

            System.out.println("Такого номера нет в телефонной книге!");
            System.out.println("Введите имя абонента для номера " + word);
            if (word.replaceAll("\\D", "").trim().length() < 11) {
                System.out.println("Вы ввели неполный номер телефона!");
                return;
            }
            String name = res.nextLine();
            map.put(name, word);
            System.out.println("Контакт сохранен!");

        } else {
            if (word.replaceAll("\\D", "").trim().length() < 11) {
                System.out.println("Вы ввели неполный номер телефона!");
                return;
            }

            System.out.println("Такого номера нет в телефонной книге!");
            System.out.println("Введите имя абонента для номера " + word);
            String name = res.nextLine();
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
