package org.msgpack.jackson.dataformat;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = Serializer.class)
public class MessagePackExtensionType {
    private final byte a;
    private final byte[] b;

    public static class Serializer extends JsonSerializer<MessagePackExtensionType> {
        public void a(MessagePackExtensionType messagePackExtensionType, JsonGenerator jsonGenerator) {
            if (jsonGenerator instanceof a) {
                ((a) jsonGenerator).l(messagePackExtensionType);
                return;
            }
            StringBuilder V0 = je.V0("'gen' is expected to be MessagePackGenerator but it's ");
            V0.append(jsonGenerator.getClass());
            throw new IllegalStateException(V0.toString());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider] */
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void serialize(MessagePackExtensionType messagePackExtensionType, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            a(messagePackExtensionType, jsonGenerator);
        }
    }

    public MessagePackExtensionType(byte b2, byte[] bArr) {
        this.a = b2;
        this.b = bArr;
    }

    public byte[] a() {
        return this.b;
    }

    public byte b() {
        return this.a;
    }
}
