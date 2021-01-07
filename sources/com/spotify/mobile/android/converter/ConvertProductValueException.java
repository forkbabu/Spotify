package com.spotify.mobile.android.converter;

import kotlin.jvm.internal.h;

public final class ConvertProductValueException extends Exception {
    private static final long serialVersionUID = -4803573546423612268L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConvertProductValueException(Class<?> cls, String str) {
        super("Value " + str + " couldn't be converted to target type " + cls.getCanonicalName());
        h.e(cls, "targetType");
        h.e(str, "value");
    }
}
