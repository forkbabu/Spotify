package com.spotify.cosmos.android.cosmonaut.atoms;

import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public class RequestTransformers {
    private final List<Converter<?, byte[]>> mConverters;

    RequestTransformers(List<Converter.Factory> list) {
        this.mConverters = new ArrayList(list.size());
        for (Converter.Factory factory : list) {
            this.mConverters.add(factory.createRequestConverter());
        }
    }

    public Converter<?, byte[]> find(Type type) {
        for (Converter<?, byte[]> converter : this.mConverters) {
            if (converter.canHandle(type)) {
                return converter;
            }
        }
        throw new IllegalArgumentException(type + " is not supported by RequestTransformers");
    }
}
