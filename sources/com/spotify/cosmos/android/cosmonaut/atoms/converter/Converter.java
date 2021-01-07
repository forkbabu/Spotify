package com.spotify.cosmos.android.cosmonaut.atoms.converter;

import java.lang.reflect.Type;

public interface Converter<From, To> {

    public interface Factory {
        Converter<?, byte[]> createRequestConverter();

        Converter<byte[], ?> createResponseConverter();
    }

    boolean canHandle(Type type);

    To convert(Type type, From from);
}
