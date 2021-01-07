package com.google.android.gms.internal.cast;

/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum r can be incorrect */
public enum zzmq {
    VOID(Void.class, Void.class, null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzlb.class, zzlb.class, zzlb.a),
    ENUM(r1, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    
    private final Class<?> zzbsj;
    private final Class<?> zzbsk;
    private final Object zzbsl;

    static {
        Class cls = Integer.TYPE;
    }

    private zzmq(Class cls, Class cls2, Object obj) {
        this.zzbsj = cls;
        this.zzbsk = cls2;
        this.zzbsl = obj;
    }

    public final Class<?> d() {
        return this.zzbsk;
    }
}
