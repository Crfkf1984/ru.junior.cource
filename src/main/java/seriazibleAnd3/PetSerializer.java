package seriazibleAnd3;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

public class PetSerializer implements JsonSerializer<Pet> {
    @Override
    public JsonElement serialize(Pet pet, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive("name " + pet.getName() + " wid " + pet.getWid() + " age " + pet.getAge() );
    }
}
