package seriazibleAnd2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pet> any = new ArrayList<>();
        Pet animal1 = new Pet("Bim", "cat",3);
        Pet animal2 = new Pet("Tuk", "dog",5);
        any.add(animal1);
        any.add(animal2);
        Human man = new Human("Dima",16,"boy",56.3, 174.4,any);

        Gson chel = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String testMan = chel.toJson(man);

        System.out.println(testMan);

    }

}