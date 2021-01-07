package com.spotify.cosmos.android.cosmonaut.atoms;

import com.google.common.base.MoreObjects;
import com.spotify.cosmos.android.TypedResponse;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter;
import com.spotify.cosmos.router.Response;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public class ResponseTransformers {
    static final ResponseTransformer PASS_THROUGH = e.a;
    private final List<Converter<byte[], ?>> mConverters;

    ResponseTransformers(List<Converter.Factory> list) {
        this.mConverters = new ArrayList(list.size());
        for (Converter.Factory factory : list) {
            this.mConverters.add(factory.createResponseConverter());
        }
    }

    static Type getActualTypeArgument(Type type) {
        MoreObjects.checkArgument(type instanceof ParameterizedType);
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        boolean z = true;
        if (actualTypeArguments.length != 1) {
            z = false;
        }
        MoreObjects.checkArgument(z);
        return actualTypeArguments[0];
    }

    static boolean isTypedResponse(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return false;
        }
        Type rawType = ((ParameterizedType) type).getRawType();
        if (!(rawType instanceof Class) || !TypedResponse.class.isAssignableFrom((Class) rawType)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public ResponseTransformer create(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return PASS_THROUGH;
        }
        Type actualTypeArgument = getActualTypeArgument(type);
        if (Response.class.equals(actualTypeArgument)) {
            return PASS_THROUGH;
        }
        if (!isTypedResponse(actualTypeArgument)) {
            return new d(findConverter(actualTypeArgument), actualTypeArgument);
        }
        Type actualTypeArgument2 = getActualTypeArgument(actualTypeArgument);
        return new f(findConverter(actualTypeArgument2), actualTypeArgument2);
    }

    /* access modifiers changed from: package-private */
    public Converter<byte[], ?> findConverter(Type type) {
        for (Converter<byte[], ?> converter : this.mConverters) {
            if (converter.canHandle(type)) {
                return converter;
            }
        }
        throw new IllegalArgumentException(type + " is not supported by ResponseTransformers");
    }
}
