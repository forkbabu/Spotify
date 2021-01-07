package com.spotify.mobile.android.storylines.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.LinkedList;

public final class StorylinesUris_Deserializer extends StdDeserializer<StorylinesUris> {
    private static final long serialVersionUID = 1;

    StorylinesUris_Deserializer() {
        super(StorylinesUris.class);
    }

    public StorylinesUris a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        while (true) {
            String[] strArr = null;
            while (true) {
                if (jsonParser.nextToken() == JsonToken.END_OBJECT) {
                    return new StorylinesUris(strArr);
                }
                if (jsonParser.getCurrentToken().ordinal() == 5) {
                    String currentName = jsonParser.getCurrentName();
                    currentName.hashCode();
                    if (!currentName.equals("entityUris")) {
                        jsonParser.nextValue();
                        jsonParser.skipChildren();
                    } else {
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                            LinkedList<String> linkedList = new LinkedList();
                            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                linkedList.add(jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : _parseString(jsonParser, deserializationContext));
                            }
                            int i = 0;
                            String[] strArr2 = new String[linkedList.size()];
                            for (String str : linkedList) {
                                strArr2[i] = str;
                                i++;
                            }
                            strArr = strArr2;
                        }
                    }
                }
            }
        }
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
