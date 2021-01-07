package com.spotify.music.connection;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = OfflineStateJsonDeserializer.class)
@JsonSerialize(using = OfflineStateJsonSerializer.class)
public abstract class OfflineState implements JacksonModel {

    public static class OfflineStateJsonDeserializer extends JsonDeserializer<OfflineState> {
        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        public OfflineState a(JsonParser jsonParser) {
            char c;
            State state;
            String asText = ((JsonNode) jsonParser.readValueAs(JsonNode.class)).findValue("connection").findValue("status").asText();
            switch (asText.hashCode()) {
                case -1548612125:
                    if (asText.equals("offline")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1012222381:
                    if (asText.equals("online")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -424567171:
                    if (asText.equals("forced_offline")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -48584405:
                    if (asText.equals("reconnecting")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                state = State.ONLINE;
            } else if (c == 1) {
                state = State.FORCED_OFFLINE;
            } else if (c != 2) {
                state = State.OFFLINE;
            } else {
                state = State.RECONNECTING;
            }
            return OfflineState.create(state);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ OfflineState deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return a(jsonParser);
        }
    }

    public static class OfflineStateJsonSerializer extends JsonSerializer<OfflineState> {
        public void a(OfflineState offlineState, JsonGenerator jsonGenerator) {
            jsonGenerator.writeStartObject();
            jsonGenerator.writeFieldName("connection");
            jsonGenerator.writeStartObject();
            boolean z = offlineState.offlineState() == State.FORCED_OFFLINE;
            jsonGenerator.writeFieldName("force_offline");
            jsonGenerator.writeBoolean(z);
            jsonGenerator.writeEndObject();
            jsonGenerator.writeEndObject();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider] */
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void serialize(OfflineState offlineState, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            a(offlineState, jsonGenerator);
        }
    }

    public enum State {
        ONLINE,
        OFFLINE,
        FORCED_OFFLINE,
        RECONNECTING
    }

    public static OfflineState create(State state) {
        return new AutoValue_OfflineState(state);
    }

    public boolean offline() {
        return State.ONLINE != offlineState();
    }

    public abstract State offlineState();
}
