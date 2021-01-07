package defpackage;

/* renamed from: xo5  reason: default package */
public final class xo5<T> {
    private final T a;
    private final Throwable b;

    private xo5(T t, Throwable th) {
        this.a = t;
        this.b = th;
    }

    public static <T> xo5<T> c(T t) {
        return new xo5<>(t, null);
    }

    public static <T> xo5<T> d(Throwable th) {
        return new xo5<>(null, th);
    }

    public T a() {
        return this.a;
    }

    public boolean b() {
        return this.b != null;
    }
}
