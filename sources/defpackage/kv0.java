package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.lang.reflect.Type;

/* renamed from: kv0  reason: default package */
public class kv0 implements Converter.Factory {
    private final ObjectMapper a;

    /* renamed from: kv0$a */
    class a implements Converter<Object, byte[]> {
        a() {
        }

        @Override // com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter
        public boolean canHandle(Type type) {
            return kv0.b(type) || kv0.this.a.canSerialize(kv0.this.a.constructType(type).getRawClass());
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter
        public byte[] convert(Type type, Object obj) {
            return kv0.this.a.writeValueAsBytes(obj);
        }
    }

    /* renamed from: kv0$b */
    class b implements Converter<byte[], Object> {
        b() {
        }

        @Override // com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter
        public boolean canHandle(Type type) {
            return kv0.b(type) || kv0.this.a.canDeserialize(kv0.this.a.constructType(type));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.reflect.Type, java.lang.Object] */
        @Override // com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter
        public Object convert(Type type, byte[] bArr) {
            byte[] bArr2 = bArr;
            if (bArr2 == null || bArr2.length == 0) {
                return null;
            }
            return kv0.this.a.readValue(bArr2, kv0.this.a.constructType(type));
        }
    }

    public kv0(ObjectMapper objectMapper) {
        this.a = objectMapper;
    }

    static boolean b(Type type) {
        return (type instanceof Class) && JacksonModel.class.isAssignableFrom((Class) type);
    }

    @Override // com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter.Factory
    public Converter<?, byte[]> createRequestConverter() {
        return new a();
    }

    @Override // com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter.Factory
    public Converter<byte[], ?> createResponseConverter() {
        return new b();
    }
}
