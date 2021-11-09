package seriazibleAnd3;

import com.google.gson.*;

import java.lang.reflect.Type;

public class HumanSerializeble implements JsonSerializer<Human> {
    @Override
    public JsonElement serialize(Human human, Type type, JsonSerializationContext context) {
        JsonObject result = new JsonObject();
        result.addProperty("name", human.getName());
        result.addProperty("age", human.getAge());
        result.addProperty("pol", human.getPol());
        result.addProperty("rost", human.getRost());
        result.add("any", context.serialize(human.getAny()));
        return result;
    }
}
