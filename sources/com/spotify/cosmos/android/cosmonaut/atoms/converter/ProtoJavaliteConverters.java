package com.spotify.cosmos.android.cosmonaut.atoms.converter;

import com.google.protobuf.u;
import com.google.protobuf.x;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

public class ProtoJavaliteConverters implements Converter.Factory {
    /* access modifiers changed from: private */
    public static boolean isProtobufModel(Type type) {
        return (type instanceof Class) && u.class.isAssignableFrom((Class) type);
    }

    @Override // com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter.Factory
    public Converter<?, byte[]> createRequestConverter() {
        return new Converter<Object, byte[]>() {
            /* class com.spotify.cosmos.android.cosmonaut.atoms.converter.ProtoJavaliteConverters.AnonymousClass1 */

            @Override // com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter
            public boolean canHandle(Type type) {
                return ProtoJavaliteConverters.isProtobufModel(type);
            }

            @Override // com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter
            public byte[] convert(Type type, Object obj) {
                return ((u) obj).toByteArray();
            }
        };
    }

    @Override // com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter.Factory
    public Converter<byte[], ?> createResponseConverter() {
        return new Converter<byte[], Object>() {
            /* class com.spotify.cosmos.android.cosmonaut.atoms.converter.ProtoJavaliteConverters.AnonymousClass2 */

            @Override // com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter
            public boolean canHandle(Type type) {
                return ProtoJavaliteConverters.isProtobufModel(type);
            }

            public Object convert(Type type, byte[] bArr) {
                Class cls = (Class) type;
                try {
                    return ((x) cls.getDeclaredMethod("parser", new Class[0]).invoke(null, new Object[0])).a(bArr);
                } catch (IllegalAccessException e) {
                    throw new IOException(je.l0(cls, je.V0("failed to access "), "#parser"), e);
                } catch (NoSuchMethodException e2) {
                    throw new IOException(je.l0(cls, je.V0("failed to find method "), "#parser"), e2);
                } catch (InvocationTargetException e3) {
                    throw new IOException(je.l0(cls, je.V0("failed to invoke method "), "#parser"), e3);
                }
            }
        };
    }
}
