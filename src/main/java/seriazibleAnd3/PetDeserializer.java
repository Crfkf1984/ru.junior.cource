package seriazibleAnd3;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

public class PetDeserializer implements JsonDeserializer<Pet> {
    @Override
    public Pet deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
        Pet pet = new Pet();
        String petRes = jsonElement.getAsString();
        String name = petRes.substring(petRes.indexOf(" "), petRes.indexOf(",")).trim();
        String wid = petRes.substring(petRes.indexOf(","), petRes.lastIndexOf(",")).trim();
        String age = petRes.substring(petRes.lastIndexOf(" "));

        pet.setName(name);
        pet.setName(wid);
        pet.setName(age);
        return pet;
    }
}
