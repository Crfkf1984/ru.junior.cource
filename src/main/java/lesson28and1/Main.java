package lesson28and1;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<People> list = sortBySalaryAndAlphabet();

        list.forEach(System.out::println);

    }

    public static List<People> sortBySalaryAndAlphabet() {
        List<People> str = new ArrayList<>();
        try {
             List<String> read = Files.readAllLines(Paths.get("data/staff"));
            for (String line : read) {
                String[] text = line.split("\t");
                if (text.length != 3) {
                    System.out.println("Некорректный ввод слов!");
                    continue;
                }
                str.add(new People(text[0], Integer.parseInt(text[1]),
                        (new SimpleDateFormat("dd.MM.yyyy").parse(text[2]))));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        str.sort((d1, d2) -> {
            if (d1.getSalary().compareTo(d2.getSalary()) != 0) {
                return d1.getSalary().compareTo(d2.getSalary());
            } else {
                return d1.getName().compareTo(d2.getName());
            }
        });

        return str;
    }
}
