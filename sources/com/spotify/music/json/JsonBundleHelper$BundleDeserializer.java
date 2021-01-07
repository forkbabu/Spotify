package com.spotify.music.json;

import android.os.Bundle;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

class JsonBundleHelper$BundleDeserializer extends JsonDeserializer<Bundle> {
    JsonBundleHelper$BundleDeserializer() {
    }

    public Bundle a(JsonParser jsonParser) {
        Serializable serializable;
        Bundle bundle = new Bundle();
        ObjectCodec codec = jsonParser.getCodec();
        if (codec != null) {
            Iterator<Map.Entry<String, JsonNode>> fields = ((JsonNode) codec.readTree(jsonParser)).fields();
            ObjectCodec codec2 = jsonParser.getCodec();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> next = fields.next();
                if (!next.getValue().has("type")) {
                    serializable = (Serializable) codec2.treeToValue(next.getValue().get("value"), Object.class);
                } else {
                    serializable = ((c) codec2.treeToValue(next.getValue(), c.class)).mValue;
                }
                bundle.putSerializable(next.getKey(), serializable);
            }
            return bundle;
        }
        throw new IllegalStateException("No ObjectCodec defined for parser, needed for deserialization");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Bundle deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return a(jsonParser);
    }
}
