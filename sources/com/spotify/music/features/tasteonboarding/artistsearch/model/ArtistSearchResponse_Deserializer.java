package com.spotify.music.features.tasteonboarding.artistsearch.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.List;

public final class ArtistSearchResponse_Deserializer extends StdDeserializer<ArtistSearchResponse> {
    private static final long serialVersionUID = 1;

    ArtistSearchResponse_Deserializer() {
        super(ArtistSearchResponse.class);
    }

    public ArtistSearchResponse a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        List<TasteOnboardingItem> list = null;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        String str = null;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (jsonParser.getCurrentToken().ordinal() == 5) {
                String currentName = jsonParser.getCurrentName();
                currentName.hashCode();
                if (currentName.equals("results")) {
                    jsonParser.nextValue();
                    list = b(jsonParser, deserializationContext);
                } else if (!currentName.equals("next_page")) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    str = deserializeString(jsonParser, deserializationContext);
                }
            }
        }
        return ArtistSearchResponse.create(list, str);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:122:0x0030 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:124:0x0030 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.spotify.music.features.tasteonboarding.model.d] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x018b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem> b(com.fasterxml.jackson.core.JsonParser r21, com.fasterxml.jackson.databind.DeserializationContext r22) {
        /*
        // Method dump skipped, instructions count: 672
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse_Deserializer.b(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):java.util.List");
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
