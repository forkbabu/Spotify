package com.google.android.gms.internal.measurement;

public enum zzlh {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzgm.a),
    ENUM(null),
    MESSAGE(null);
    
    private final Object zzj;

    private zzlh(Object obj) {
        this.zzj = obj;
    }
}
