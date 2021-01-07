package com.google.gson.internal;

import com.google.gson.JsonIOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* access modifiers changed from: package-private */
public class i implements q<T> {
    final /* synthetic */ Type a;

    i(f fVar, Type type) {
        this.a = type;
    }

    @Override // com.google.gson.internal.q
    public T a() {
        Type type = this.a;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T) EnumSet.noneOf((Class) type2);
            }
            StringBuilder V0 = je.V0("Invalid EnumSet type: ");
            V0.append(this.a.toString());
            throw new JsonIOException(V0.toString());
        }
        StringBuilder V02 = je.V0("Invalid EnumSet type: ");
        V02.append(this.a.toString());
        throw new JsonIOException(V02.toString());
    }
}
