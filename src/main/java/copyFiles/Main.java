package copyFiles;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите папку, которую нужно скопировать!");
        Scanner scanner = new Scanner(System.in);
        String oneFolder = scanner.nextLine();
        File source = new File(oneFolder);
        System.out.println("Введите папку куда все будет скапировано!");
        String twofolder = scanner.nextLine();
        File baza = new File(twofolder);
        copyFolder(source,baza);

    }

    public static void copyFolder(File source, File baza) {
        try {
            FileUtils.copyDirectory(source, baza);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
