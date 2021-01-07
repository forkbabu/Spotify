package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.google.common.net.HostAndPort;

public class HostAndPortDeserializer extends FromStringDeserializer<HostAndPort> {
    private static final long serialVersionUID = 1;
    public static final HostAndPortDeserializer std = new HostAndPortDeserializer();

    public HostAndPortDeserializer() {
        super(HostAndPort.class);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public /* bridge */ /* synthetic */ HostAndPort _deserialize(String str, DeserializationContext deserializationContext) {
        return _deserialize(str);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (!jsonParser.hasToken(JsonToken.START_OBJECT)) {
            return (HostAndPort) super.deserialize(jsonParser, deserializationContext);
        }
        ObjectCodec codec = jsonParser.getCodec();
        if (codec != null) {
            JsonNode jsonNode = (JsonNode) codec.readTree(jsonParser);
            JsonNode jsonNode2 = jsonNode.get("host");
            String asText = jsonNode2 == null ? jsonNode.path("hostText").asText() : jsonNode2.textValue();
            JsonNode jsonNode3 = jsonNode.get("port");
            if (jsonNode3 == null) {
                return HostAndPort.fromString(asText);
            }
            return HostAndPort.fromParts(asText, jsonNode3.asInt());
        }
        throw new IllegalStateException("No ObjectCodec defined for parser, needed for deserialization");
    }

    /* access modifiers changed from: protected */
    public HostAndPort _deserialize(String str) {
        return HostAndPort.fromString(str);
    }
}
