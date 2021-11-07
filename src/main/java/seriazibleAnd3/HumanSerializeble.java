package seriazibleAnd3;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

public class HumanSerializeble implements JsonSerializer<Human> {
    @Override
    public JsonElement serialize(Human human, Type type, JsonSerializationContext context) {
        JsonPrimitive result =  new JsonPrimitive("name " + human.getName() + ", age " +
                human.getAge() + ", pol " + human.getPol() + ", rost " +
                human.getRost() + ", any" + context.serialize(human.getAny()));
        return result;
    }
}
