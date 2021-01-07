package com.google.android.gms.internal.cast;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class j5 {
    private static volatile j5 b;
    private static final j5 c = new j5(true);
    private final Map<Object, Object> a;

    j5() {
        new HashMap();
    }

    public static j5 a() {
        j5 j5Var = b;
        if (j5Var == null) {
            synchronized (j5.class) {
                j5Var = b;
                if (j5Var == null) {
                    j5Var = c;
                    b = j5Var;
                }
            }
        }
        return j5Var;
    }

    private j5(boolean z) {
        this.a = Collections.emptyMap();
    }
}
