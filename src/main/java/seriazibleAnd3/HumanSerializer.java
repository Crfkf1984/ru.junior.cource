package seriazibleAnd3;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

public class HumanSerializer implements JsonSerializer<Human> {
    @Override
    public JsonElement serialize(Human human, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject result = new JsonObject();
        result.addProperty("name", human.getName());
        result.addProperty("age", human.getAge());
        result.addProperty("pol", human.getPol());
        result.addProperty("rost", human.getRost());
        result.add("any", jsonSerializationContext.serialize(human.getAny()));
        return result;
    }
}
