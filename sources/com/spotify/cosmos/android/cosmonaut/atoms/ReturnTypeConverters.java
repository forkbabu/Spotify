package com.spotify.cosmos.android.cosmonaut.atoms;

import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import io.reactivex.a;
import io.reactivex.s;
import io.reactivex.z;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

enum ReturnTypeConverters implements ReturnTypeConverter {
    OBSERVABLE {
        @Override // com.spotify.cosmos.android.cosmonaut.atoms.ReturnTypeConverter
        public Object convert(ResponseTransformer responseTransformer, s<Response> sVar) {
            return sVar.q(responseTransformer);
        }

        @Override // com.spotify.cosmos.android.cosmonaut.atoms.ReturnTypeConverter
        public boolean isSupported(Type type, String str) {
            return ReturnTypeConverters.isSub(str) && ReturnTypeConverters.isGenericTypeOf(type, s.class);
        }
    },
    SINGLE {
        @Override // com.spotify.cosmos.android.cosmonaut.atoms.ReturnTypeConverter
        public Object convert(ResponseTransformer responseTransformer, s<Response> sVar) {
            return sVar.q(responseTransformer).B0();
        }

        @Override // com.spotify.cosmos.android.cosmonaut.atoms.ReturnTypeConverter
        public boolean isSupported(Type type, String str) {
            return !ReturnTypeConverters.isSub(str) && ReturnTypeConverters.isGenericTypeOf(type, z.class);
        }
    },
    COMPLETABLE {
        @Override // com.spotify.cosmos.android.cosmonaut.atoms.ReturnTypeConverter
        public Object convert(ResponseTransformer responseTransformer, s<Response> sVar) {
            sVar.getClass();
            return new io.reactivex.internal.operators.observable.z(sVar);
        }

        @Override // com.spotify.cosmos.android.cosmonaut.atoms.ReturnTypeConverter
        public boolean isSupported(Type type, String str) {
            return !ReturnTypeConverters.isSub(str) && !ReturnTypeConverters.isGet(str) && type.equals(a.class);
        }
    };
    
    private static final ReturnTypeConverters[] VALUES = values();

    static ReturnTypeConverter find(Method method) {
        String findAction = ReflectionUtil.findAction(method);
        Type genericReturnType = method.getGenericReturnType();
        ReturnTypeConverters[] returnTypeConvertersArr = VALUES;
        for (ReturnTypeConverters returnTypeConverters : returnTypeConvertersArr) {
            if (returnTypeConverters.isSupported(genericReturnType, findAction)) {
                return returnTypeConverters;
            }
        }
        throw new IllegalArgumentException(method + "'s (action, return type) pair is not supported: " + findAction + ", " + genericReturnType);
    }

    static boolean isGenericTypeOf(Type type, Class<?> cls) {
        return (type instanceof ParameterizedType) && ((ParameterizedType) type).getRawType().equals(cls);
    }

    static boolean isGet(String str) {
        return Request.GET.equals(str);
    }

    static boolean isSub(String str) {
        return Request.SUB.equals(str);
    }
}
