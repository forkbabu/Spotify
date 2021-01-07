package defpackage;

import java.util.HashSet;
import java.util.LinkedHashMap;

/* renamed from: cjf  reason: default package */
public final class cjf {
    private static int a(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    static <T> HashSet<T> b(int i) {
        return new HashSet<>(a(i));
    }

    public static <K, V> LinkedHashMap<K, V> c(int i) {
        return new LinkedHashMap<>(a(i));
    }
}
