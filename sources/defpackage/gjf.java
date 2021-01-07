package defpackage;

/* renamed from: gjf  reason: default package */
public final class gjf<T> implements fjf<T>, ajf<T> {
    private final T a;

    private gjf(T t) {
        this.a = t;
    }

    public static <T> fjf<T> a(T t) {
        if (t != null) {
            return new gjf(t);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // defpackage.wlf
    public T get() {
        return this.a;
    }
}
