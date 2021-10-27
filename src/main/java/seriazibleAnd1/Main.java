package seriazibleAnd1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Human man = new Human("Dima",16,"boy",56.3, 174.4);
        Pet animal = new Pet("Bim", "cat",3);

        Gson chel = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        Gson any = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String testMan = chel.toJson(chel);
        String testAny = any.toJson(any);

    }

}