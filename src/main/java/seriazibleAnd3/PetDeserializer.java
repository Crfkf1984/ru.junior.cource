package seriazibleAnd3;

import com.google.gson.*;

import java.lang.reflect.Type;

public class PetDeserializer implements JsonDeserializer<Pet> {
    @Override
    public Pet deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
        Pet pets = new Pet();
            String petRes = jsonElement.getAsString();
            String name = petRes.substring(petRes.indexOf(" "), petRes.indexOf(",")).trim();
            String wid = petRes.substring(petRes.indexOf(","), petRes.lastIndexOf(",")).trim();
            String age = petRes.substring(petRes.lastIndexOf(" ")).trim();

            pets.setName(name);
            pets.setWid(wid);
            pets.setAge(Integer.parseInt(age));

        return pets;
    }
}
