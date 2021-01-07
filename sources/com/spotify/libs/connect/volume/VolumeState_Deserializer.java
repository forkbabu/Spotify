package com.spotify.libs.connect.volume;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public final class VolumeState_Deserializer extends StdDeserializer<VolumeState> {
    private static final long serialVersionUID = 1;

    VolumeState_Deserializer() {
        super(VolumeState.class);
    }

    public VolumeState a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Float f = null;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        boolean z = false;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (jsonParser.getCurrentToken().ordinal() == 5) {
                String currentName = jsonParser.getCurrentName();
                currentName.hashCode();
                if (currentName.equals("volume")) {
                    jsonParser.nextValue();
                    f = (Float) NumberDeserializers.find(Float.class, "java.lang.Float").deserialize(jsonParser, deserializationContext);
                } else if (!currentName.equals("system_initiated")) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    z = ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
                }
            }
        }
        return new VolumeState(z, f);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        try {
            return a(jsonParser, deserializationContext);
        } catch (RuntimeException e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            throw JsonMappingException.from(deserializationContext, e.getMessage(), e);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }
}
