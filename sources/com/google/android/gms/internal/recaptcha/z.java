package com.google.android.gms.internal.recaptcha;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class z {
    private static volatile z b;
    private static final z c = new z(true);
    private final Map<Object, Object<?, ?>> a;

    z() {
        new HashMap();
    }

    public static z a() {
        z zVar = b;
        if (zVar == null) {
            synchronized (z.class) {
                zVar = b;
                if (zVar == null) {
                    zVar = c;
                    b = zVar;
                }
            }
        }
        return zVar;
    }

    private z(boolean z) {
        this.a = Collections.emptyMap();
    }
}
