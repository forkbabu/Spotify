package com.google.android.gms.internal.cast;

public enum zzpo {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzlb.a),
    ENUM(null),
    MESSAGE(null);
    
    private final Object zzbsl;

    private zzpo(Object obj) {
        this.zzbsl = obj;
    }
}
