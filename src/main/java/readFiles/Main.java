package readFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
//        try {
//            long res = Files.walk(Paths.get("D:\\Project\\ru.junior.cource")).filter(path -> path.toFile()
//                    .isFile()).mapToLong(path-> path.toFile().length()).sum();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println("Введите путь до папки!");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        long res = calculateFolderSize(path);
        convert(res, path);

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

    public static void convert(long res, String path) {
        if (res < 1000) {
            System.out.println("размер папки " + path + " составляет " + res + " Байт");
        } else if (res < 10000) {
            System.out.println("размер папки " + path + " составляет " + (res / 1000) + " КБ");
        } else {
            System.out.println("размер папки " + path + " составляет " + (res / 1000000) + " МБ");
        }
    }

}
