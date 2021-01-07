package io.reactivex.internal.functions;

import io.reactivex.functions.d;

public final class a {
    static final d<Object, Object> a = new C0611a();

    /* renamed from: io.reactivex.internal.functions.a$a  reason: collision with other inner class name */
    static final class C0611a implements d<Object, Object> {
        C0611a() {
        }

        @Override // io.reactivex.functions.d
        public boolean a(Object obj, Object obj2) {
            return a.a(obj, obj2);
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T> d<T, T> b() {
        return (d<T, T>) a;
    }

    public static <T> T c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static int d(int i, String str) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }
}
