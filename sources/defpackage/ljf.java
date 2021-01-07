package defpackage;

/* renamed from: ljf  reason: default package */
public final class ljf<T> implements wlf<T> {
    private static final Object c = new Object();
    private volatile wlf<T> a;
    private volatile Object b = c;

    private ljf(wlf<T> wlf) {
        this.a = wlf;
    }

    public static <P extends wlf<T>, T> wlf<T> a(P p) {
        if ((p instanceof ljf) || (p instanceof ejf)) {
            return p;
        }
        p.getClass();
        return new ljf(p);
    }

    @Override // defpackage.wlf
    public T get() {
        T t = (T) this.b;
        if (t != c) {
            return t;
        }
        wlf<T> wlf = this.a;
        if (wlf == null) {
            return (T) this.b;
        }
        T t2 = wlf.get();
        this.b = t2;
        this.a = null;
        return t2;
    }
}
