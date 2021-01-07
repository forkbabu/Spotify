package defpackage;

/* renamed from: ejf  reason: default package */
public final class ejf<T> implements wlf<T>, ajf<T> {
    private static final Object c = new Object();
    private volatile wlf<T> a;
    private volatile Object b = c;

    private ejf(wlf<T> wlf) {
        this.a = wlf;
    }

    public static <P extends wlf<T>, T> ajf<T> a(P p) {
        if (p instanceof ajf) {
            return (ajf) p;
        }
        p.getClass();
        return new ejf(p);
    }

    public static <P extends wlf<T>, T> wlf<T> b(P p) {
        p.getClass();
        if (p instanceof ejf) {
            return p;
        }
        return new ejf(p);
    }

    public static Object c(Object obj, Object obj2) {
        if (!(obj != c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // defpackage.wlf
    public T get() {
        T t = (T) this.b;
        Object obj = c;
        if (t == obj) {
            synchronized (this) {
                t = this.b;
                if (t == obj) {
                    t = this.a.get();
                    c(this.b, t);
                    this.b = t;
                    this.a = null;
                }
            }
        }
        return t;
    }
}
