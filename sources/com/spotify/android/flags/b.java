package com.spotify.android.flags;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Deprecated
public abstract class b<T extends Serializable> {
    private static final Map<String, b<?>> f = new HashMap(64);
    private static final Set<Integer> g = Collections.synchronizedSet(new HashSet());
    private final String a;
    private final Integer b;
    private final i c;
    private final Class<T> d;
    private final String e;

    public b(Class<T> cls, String str, i iVar, Overridable overridable, String str2) {
        Map<String, b<?>> map = f;
        if (!map.containsKey(str)) {
            map.put(str, this);
            int length = str.length();
            int i = 0;
            if (length > 0) {
                int i2 = 0;
                while (i < length) {
                    i2 = (i2 * 31) + str.charAt(i);
                    i++;
                }
                i = i2;
            }
            Integer valueOf = Integer.valueOf(i);
            this.b = valueOf;
            if (g.add(valueOf)) {
                this.d = cls;
                this.c = iVar;
                this.a = str;
                this.e = str2;
                return;
            }
            throw new AssertionError(je.x0("There can be only one feature flag instance with the same hashcode identifier ", str));
        }
        throw new AssertionError(je.x0("There can be only one feature flag instance with identifier ", str));
    }

    public static b<?> b(String str) {
        b<?> bVar = f.get(str);
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException(je.y0("Flag ", str, " does not exist"));
    }

    public final String a() {
        return this.e;
    }

    public final Integer c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public final i e() {
        return this.c;
    }

    public Class<T> f() {
        return this.d;
    }

    public abstract boolean g(T t);

    public abstract T h(String str);
}
