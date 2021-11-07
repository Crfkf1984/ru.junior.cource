package seriazibleAnd3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pet> petList = new ArrayList<>();
        petList.add(new Pet("Kuzya", "cat", 5));
        petList.add(new Pet("Palkan", "dog", 4));
        List<Human> humanBandList = new ArrayList<>();
        humanBandList.add(new Human("Petr", 45, "mans",78.4, 167.5,petList));
        humanBandList.add(new Human("Lena", 34, "women",65.4, 145.5,petList));

        HumanBand humanBand = new HumanBand(humanBandList);


        Gson gson = new GsonBuilder()
                .setPrettyPrinting().
                        registerTypeAdapter(Human.class, new HumanSerializeble())
                .registerTypeAdapter(Pet.class, new PetSerializer())
                .registerTypeAdapter(HumanSerializeBand.class, new HumanSerializeBand())
                .create();

        String test = gson.toJson(humanBand);
        System.out.println(test);

    }

}