package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.util.TokenBuffer;

@JacksonStdImpl
public class TokenBufferDeserializer extends StdScalarDeserializer<TokenBuffer> {
    private static final long serialVersionUID = 1;

    public TokenBufferDeserializer() {
        super(TokenBuffer.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken nextToken;
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, (DeserializationContext) null);
        if (jsonParser.getCurrentTokenId() != JsonToken.FIELD_NAME.id()) {
            tokenBuffer.copyCurrentStructure(jsonParser);
        } else {
            tokenBuffer.writeStartObject();
            do {
                tokenBuffer.copyCurrentStructure(jsonParser);
                nextToken = jsonParser.nextToken();
            } while (nextToken == JsonToken.FIELD_NAME);
            JsonToken jsonToken = JsonToken.END_OBJECT;
            if (nextToken == jsonToken) {
                tokenBuffer.writeEndObject();
            } else {
                deserializationContext.reportWrongTokenException(TokenBuffer.class, jsonToken, "Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got " + nextToken, new Object[0]);
                throw null;
            }
        }
        return tokenBuffer;
    }
}
