package lesson12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int numb = scanner.nextInt();
        int res = sumDigits(numb);
        System.out.println(res);
    }

    public static int sumDigits(int numb) {
        int count = 0;
        String conversToString = Integer.toString(numb);
        for (int i = 0; i < conversToString.length(); i++) {
            char df = conversToString.charAt(i);
            int rt = Integer.parseInt(String.valueOf(df));
            count += rt;
        }
        return count;
    }
}
