package lesson14and4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер телефона с кодом страны Россия!");
        String tel = scanner.nextLine();
        tel = tel.replaceAll("\\D+", "");

        if (tel.length() == 10 ) {
            tel = "7" + tel;
            tel = tel.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "+7 ($2) $3 $4-$5");
            System.out.println(tel);
        } else if (tel.length() == 11 && (!tel.substring(0,1).equals("9"))){
             tel = tel.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "+7 ($2) $3 $4-$5");
            System.out.println(tel);
        } else {
            System.out.println("Символов в телефоне " + tel.length() + " номер неверный! " + " номер начинается с "
            + tel.substring(0,1));
        }
    }
}
