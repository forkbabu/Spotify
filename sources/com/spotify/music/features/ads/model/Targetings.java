package com.spotify.music.features.ads.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@JsonDeserialize(using = Targetings_Deserializer.class)
@JsonSerialize(using = Serializer.class)
public class Targetings implements JacksonModel {
    public static final String AD_USER_ID = "aduserid";
    public Map<String, String> mCustomTargetings;

    public static class Serializer extends JsonSerializer<Targetings> {
        public void a(Targetings targetings, JsonGenerator jsonGenerator) {
            jsonGenerator.writeStartObject();
            for (Map.Entry<String, String> entry : targetings.mCustomTargetings.entrySet()) {
                jsonGenerator.writeStringField(entry.getKey(), entry.getValue());
            }
            jsonGenerator.writeEndObject();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider] */
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void serialize(Targetings targetings, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            a(targetings, jsonGenerator);
        }
    }

    public Targetings() {
        this(Collections.emptyMap());
    }

    public Map<String, String> getCustomTargetings() {
        return this.mCustomTargetings;
    }

    @JsonCreator
    public Targetings(Map<String, String> map) {
        this.mCustomTargetings = new HashMap(map);
    }
}
