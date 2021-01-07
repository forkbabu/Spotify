package defpackage;

/* renamed from: re4  reason: default package */
public final class re4<T> {
    private final T a;

    private re4(T t, Throwable th) {
        this.a = t;
    }

    public static <T> re4<T> c(T t) {
        return new re4<>(t, null);
    }

    public static <T> re4<T> d(Throwable th) {
        return new re4<>(null, th);
    }

    public T a() {
        return this.a;
    }

    public boolean b() {
        return this.a != null;
    }
}
