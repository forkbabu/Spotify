package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

public abstract class StdConverter<IN, OUT> implements Converter<IN, OUT> {
    /* access modifiers changed from: protected */
    public JavaType _findConverterType(TypeFactory typeFactory) {
        JavaType findSuperType = typeFactory.constructType(getClass()).findSuperType(Converter.class);
        if (findSuperType != null && findSuperType.containedTypeCount() >= 2) {
            return findSuperType;
        }
        StringBuilder V0 = je.V0("Cannot find OUT type parameter for Converter of type ");
        V0.append(getClass().getName());
        throw new IllegalStateException(V0.toString());
    }

    @Override // com.fasterxml.jackson.databind.util.Converter
    public JavaType getInputType(TypeFactory typeFactory) {
        return _findConverterType(typeFactory).containedType(0);
    }

    @Override // com.fasterxml.jackson.databind.util.Converter
    public JavaType getOutputType(TypeFactory typeFactory) {
        return _findConverterType(typeFactory).containedType(1);
    }
}
