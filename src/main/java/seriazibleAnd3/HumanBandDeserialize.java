package seriazibleAnd3;

import com.google.gson.*;

import java.lang.reflect.Type;

public class HumanBandDeserialize implements JsonDeserializer<HumanBand> {
    @Override
    public HumanBand deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
        HumanBand humanBand = new HumanBand();
        JsonObject object = jsonElement.getAsJsonObject();
        JsonArray humans = object.getAsJsonArray("humans");

        for (JsonElement res : humans) {
            humanBand.setHumanNotList(context.deserialize(res, Human.class));
        }
        return humanBand;
    }
}
