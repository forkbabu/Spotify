package com.spotify.music.features.ads.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.HashMap;

public final class Targetings_Deserializer extends StdDeserializer<Targetings> {
    private static final long serialVersionUID = 1;

    Targetings_Deserializer() {
        super(Targetings.class);
    }

    public Targetings a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str;
        String str2;
        JsonToken currentToken = jsonParser.getCurrentToken();
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        HashMap hashMap = null;
        if (currentToken == jsonToken) {
            return null;
        }
        if (jsonParser.getCurrentToken() != jsonToken) {
            HashMap hashMap2 = new HashMap();
            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                JsonToken currentToken2 = jsonParser.getCurrentToken();
                JsonToken jsonToken2 = JsonToken.VALUE_NULL;
                if (currentToken2 == jsonToken2) {
                    str = null;
                } else {
                    str = _parseString(jsonParser, deserializationContext);
                }
                jsonParser.nextValue();
                if (jsonParser.getCurrentToken() == jsonToken2) {
                    str2 = null;
                } else {
                    str2 = _parseString(jsonParser, deserializationContext);
                }
                hashMap2.put(str, str2);
            }
            hashMap = hashMap2;
        }
        return new Targetings(hashMap);
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
