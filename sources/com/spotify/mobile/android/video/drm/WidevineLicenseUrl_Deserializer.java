package com.spotify.mobile.android.video.drm;

import com.adjust.sdk.Constants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public final class WidevineLicenseUrl_Deserializer extends StdDeserializer<WidevineLicenseUrl> {
    private static final long serialVersionUID = 1;

    WidevineLicenseUrl_Deserializer() {
        super(WidevineLicenseUrl.class);
    }

    public WidevineLicenseUrl a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        long j = 0;
        while (true) {
            String str = null;
            while (true) {
                if (jsonParser.nextToken() == JsonToken.END_OBJECT) {
                    return new WidevineLicenseUrl(str, j);
                }
                if (jsonParser.getCurrentToken().ordinal() == 5) {
                    String currentName = jsonParser.getCurrentName();
                    currentName.hashCode();
                    if (currentName.equals("expires")) {
                        jsonParser.nextValue();
                        j = ((Long) NumberDeserializers.find(Long.TYPE, Constants.LONG).deserialize(jsonParser, deserializationContext)).longValue();
                    } else if (!currentName.equals("uri")) {
                        jsonParser.nextValue();
                        jsonParser.skipChildren();
                    } else {
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                            str = _parseString(jsonParser, deserializationContext);
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
