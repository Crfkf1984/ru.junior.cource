package seriazibleAnd3;


import com.google.gson.*;

import java.lang.reflect.Type;

public class HumanSerializeBand implements JsonSerializer<HumanBand> {
    @Override
    public JsonElement serialize(HumanBand humanBand, Type type, JsonSerializationContext context) {
        JsonObject result = new JsonObject();
        result.add("human", context.serialize(humanBand.getHumans()));
        return result;
    }
}
