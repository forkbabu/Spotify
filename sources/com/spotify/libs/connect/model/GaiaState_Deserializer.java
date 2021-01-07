package com.spotify.libs.connect.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public final class GaiaState_Deserializer extends StdDeserializer<GaiaState> {
    private static final long serialVersionUID = 1;

    GaiaState_Deserializer() {
        super(GaiaState.class);
    }

    public boolean _deserializeboolean(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
    }

    public int _deserializeint(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Integer) NumberDeserializers.find(Integer.TYPE, "int").deserialize(jsonParser, deserializationContext)).intValue();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:375:0x0147 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:392:0x0508 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:398:0x0591 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:397:0x0592 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:390:0x06bb */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:373:0x06f4 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:377:0x0147 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:394:0x0508 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:399:0x0592 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r40v0 */
    /* JADX WARN: Type inference failed for: r45v0 */
    /* JADX WARN: Type inference failed for: r45v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r40v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r38v1, types: [com.spotify.libs.connect.model.DeviceState$GaiaDeviceState] */
    /* JADX WARN: Type inference failed for: r45v2 */
    /* JADX WARN: Type inference failed for: r40v2 */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r45v3 */
    /* JADX WARN: Type inference failed for: r40v3 */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r53v0 */
    /* JADX WARN: Type inference failed for: r53v1, types: [com.spotify.libs.connect.model.GaiaDeviceRedirectUris] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.spotify.libs.connect.model.GaiaDeviceCapability] */
    /* JADX WARN: Type inference failed for: r53v2 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r53v3 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r38v6 */
    /* JADX WARN: Type inference failed for: r10v37, types: [java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r10v95 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r53v10 */
    /* JADX WARN: Type inference failed for: r53v11 */
    /* JADX WARN: Type inference failed for: r53v12 */
    /* JADX WARN: Type inference failed for: r53v13 */
    /* JADX WARN: Type inference failed for: r38v32 */
    /* JADX WARN: Type inference failed for: r38v33 */
    /* JADX WARN: Type inference failed for: r38v34 */
    /* JADX WARN: Type inference failed for: r38v35 */
    /* JADX WARN: Type inference failed for: r38v37 */
    /* JADX WARN: Type inference failed for: r38v38 */
    /* JADX WARN: Type inference failed for: r40v30 */
    /* JADX WARN: Type inference failed for: r40v31 */
    /* JADX WARN: Type inference failed for: r40v32 */
    /* JADX WARN: Type inference failed for: r40v33 */
    /* JADX WARN: Type inference failed for: r40v34 */
    /* JADX WARN: Type inference failed for: r40v35 */
    /* JADX WARN: Type inference failed for: r40v36 */
    /* JADX WARN: Type inference failed for: r40v37 */
    /* JADX WARN: Type inference failed for: r40v38 */
    /* JADX WARN: Type inference failed for: r45v32 */
    /* JADX WARN: Type inference failed for: r45v33 */
    /* JADX WARN: Type inference failed for: r45v34 */
    /* JADX WARN: Type inference failed for: r45v35 */
    /* JADX WARN: Type inference failed for: r45v36 */
    /* JADX WARN: Type inference failed for: r45v37 */
    /* JADX WARN: Type inference failed for: r45v38 */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03a5  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.libs.connect.model.GaiaState a(com.fasterxml.jackson.core.JsonParser r56, com.fasterxml.jackson.databind.DeserializationContext r57) {
        /*
        // Method dump skipped, instructions count: 2078
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.connect.model.GaiaState_Deserializer.a(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.libs.connect.model.GaiaState");
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
