package seriazibleAnd3;

import com.google.gson.*;

import java.lang.reflect.Type;

public class HumanDeserializer implements JsonDeserializer<Human> {
    @Override
    public Human deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
        Human human = new Human();
        JsonObject object = jsonElement.getAsJsonObject();

        human.setName(object.get("name").getAsString());
        human.setName(object.get("age").getAsString());
        human.setName(object.get("pol").getAsString());
        human.setName(object.get("rost").getAsString());
        human.setName(context.deserialize(object.get("any"), Pet.class));
        return human;
    }
}
