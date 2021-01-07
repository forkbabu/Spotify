package com.spotify.libs.search.offline.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public final class OfflineResults_Deserializer extends StdDeserializer<OfflineResults> {
    private static final long serialVersionUID = 1;

    OfflineResults_Deserializer() {
        super(OfflineResults.class);
    }

    public boolean _deserializeboolean(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0384  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.libs.search.offline.model.OfflineResults a(com.fasterxml.jackson.core.JsonParser r23, com.fasterxml.jackson.databind.DeserializationContext r24) {
        /*
        // Method dump skipped, instructions count: 1224
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.search.offline.model.OfflineResults_Deserializer.a(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.libs.search.offline.model.OfflineResults");
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

    public String deserializeString(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        return _parseString(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }
}
