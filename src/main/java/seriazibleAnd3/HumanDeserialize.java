package seriazibleAnd3;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class HumanDeserialize implements JsonDeserializer<Human> {
    @Override
    public Human deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
        Human human = new Human();
        JsonObject object = jsonElement.getAsJsonObject();
       human.setName(object.get("name").getAsString());
       human.setAge(object.get("age").getAsInt());
       human.setPol(object.get("pol").getAsString());
       human.setRost(object.get("rost").getAsDouble());

       JsonArray pets = object.getAsJsonArray("any");
        List<Pet> petList = new ArrayList<>();

        for (JsonElement res : pets) {
           petList.add(context.deserialize(res, Pet.class));
        }
       human.setAny(petList);
        return human;
    }
}
