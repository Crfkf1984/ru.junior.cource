package readFiles;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите путь до папки!");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        long res = calculateFolderSize(path);

        if (res < 1000) {
            System.out.println("размер папки " + path + " составляет " + res + " Байт");
        } else if (res >= 1000 && res < 10000) {
            System.out.println("размер папки " + path + " составляет " + (res / 1000) + " КБ");
        } else {
            System.out.println("размер папки " + path + " составляет " + (res / 10000) + " МБ");
        }

    }

    public static long calculateFolderSize(String path) {
        long sum = 0;
        try {
            File file = new File(path);
            File[] directory = file.listFiles();
            for (File res : directory) {
                sum+=res.length();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sum;
    }
}
