package com.spotify.cosmos.android.cosmonaut.atoms.converter;

import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter;
import java.lang.reflect.Type;

public class ByteArrayConverters implements Converter.Factory {
    private static final Converter<byte[], byte[]> PASS_THROUGH = new Converter<byte[], byte[]>() {
        /* class com.spotify.cosmos.android.cosmonaut.atoms.converter.ByteArrayConverters.AnonymousClass1 */

        @Override // com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter
        public boolean canHandle(Type type) {
            return type.equals(byte[].class);
        }

        public byte[] convert(Type type, byte[] bArr) {
            return bArr;
        }
    };

    @Override // com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter.Factory
    public Converter<byte[], byte[]> createRequestConverter() {
        return PASS_THROUGH;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter<byte[], byte[]>, com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter<byte[], ?> */
    @Override // com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter.Factory
    public Converter<byte[], ?> createResponseConverter() {
        return PASS_THROUGH;
    }
}
