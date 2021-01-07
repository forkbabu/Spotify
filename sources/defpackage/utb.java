package defpackage;

/* renamed from: utb  reason: default package */
public final class utb<T> {
    private final T a;

    private utb(T t, Throwable th) {
        this.a = t;
    }

    public static <T> utb<T> b(T t) {
        return new utb<>(t, null);
    }

    public static <T> utb<T> c(Throwable th) {
        return new utb<>(null, th);
    }

    public T a() {
        return this.a;
    }
}
