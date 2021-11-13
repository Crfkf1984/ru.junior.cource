package logirovanie1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class Main {
    private static final Pattern NAME = Pattern.compile("^[А-я\\s]+$");
    private static final Pattern NUMB = Pattern.compile("[0-9+\\s+]+$");
    private static final String LIST = "LIST";
    private static final String EXIT = "EXIT";
    private static Map<String, String> map = new TreeMap<>();
    private static Logger logger;

    public static void main(String[] args) {
        logger = LogManager.getRootLogger();
        boolean isTrue = true;
        Scanner scanner = new Scanner(System.in);

        long time = System.currentTimeMillis();
        logger.error(time);

        while (isTrue) {
            boolean isFalse = false;

            System.out.println("Введите номер, имя или команду!");
            String word = scanner.nextLine();
            logger.info(word);

            if (word.matches(String.valueOf(NAME))) {
                name(word);
                isFalse = true;
            }
            if (word.matches(String.valueOf(NUMB))) {
                telNum(word);
                isFalse = true;
            }

            if (word.startsWith(LIST)) {
                list();
                isFalse = true;
            }
            if (word.startsWith(EXIT)) {
                exit();
                isTrue = false;
                isFalse = true;
            }

            if (!isFalse) {
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
                    String name = key.getKey();
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

        if (map.size() > 0) {

            for (Map.Entry<String, String> tel : map.entrySet()) {
                if (verify(word)) {
                    return;
                }
                if (word.equals(tel.getValue())) {
                    String name = tel.getKey();
                    String num = tel.getValue();
                    System.out.println(name + " - " + num.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})"
                            , "+7 ($2) $3 $4 - $5"));
                    return;
                }
            }

            isVerifyreSult(word);

        } else {

            isVerifyreSult(word);

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

    public static boolean verify(String word) {
        boolean isNums = false;
        if (word.replaceAll("\\D", "").trim().length() < 11) {
            System.out.println("Вы ввели неполный номер телефона!");
            isNums = true;
        }
        return isNums;
    }

    public static boolean verifyName(String name) {
        boolean isNames = false;
        if (!name.matches(String.valueOf(NAME))) {
            System.out.println("Вы ввели неверный формат имени!");
            isNames = true;
        }
        return isNames;
    }

    public static void isVerifyreSult(String word) {
        Scanner res = new Scanner(System.in);
        if (verify(word)) {
            return;
        }
        System.out.println("Такого номера нет в телефонной книге!");
        System.out.println("Введите имя абонента для номера " + word);
        String name = res.nextLine();
        logger.warn(name);
        if (verifyName(name)) {
            return;
        }
        map.put(name, word);
        System.out.println("Контакт сохранен!");
    }
}
