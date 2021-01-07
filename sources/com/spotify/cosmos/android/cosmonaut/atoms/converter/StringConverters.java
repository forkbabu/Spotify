package com.spotify.cosmos.android.cosmonaut.atoms.converter;

import com.adjust.sdk.Constants;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter;
import java.lang.reflect.Type;
import java.nio.charset.Charset;

public class StringConverters implements Converter.Factory {
    private static final Charset DEFAULT_CHARSET = Charset.forName(Constants.ENCODING);

    @Override // com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter.Factory
    public Converter<?, byte[]> createRequestConverter() {
        return new Converter<Object, byte[]>() {
            /* class com.spotify.cosmos.android.cosmonaut.atoms.converter.StringConverters.AnonymousClass1 */

            @Override // com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter
            public boolean canHandle(Type type) {
                return type.equals(String.class);
            }

            @Override // com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter
            public byte[] convert(Type type, Object obj) {
                return ((String) obj).getBytes(StringConverters.DEFAULT_CHARSET);
            }
        };
    }

    @Override // com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter.Factory
    public Converter<byte[], ?> createResponseConverter() {
        return new Converter<byte[], Object>() {
            /* class com.spotify.cosmos.android.cosmonaut.atoms.converter.StringConverters.AnonymousClass2 */

            @Override // com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter
            public boolean canHandle(Type type) {
                return type.equals(String.class);
            }

            public Object convert(Type type, byte[] bArr) {
                return new String(bArr, StringConverters.DEFAULT_CHARSET);
            }
        };
    }
}
