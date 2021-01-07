package com.google.android.play.core.internal;

public final class z<T> implements a0, x {
    private static final Object c = new Object();
    private volatile a0<T> a;
    private volatile Object b = c;

    private z(a0<T> a0Var) {
        this.a = a0Var;
    }

    public static <P extends a0<T>, T> a0<T> a(P p) {
        return p instanceof z ? p : new z(p);
    }

    public static <P extends a0<T>, T> x<T> b(P p) {
        if (p instanceof x) {
            return (x) p;
        }
        p.getClass();
        return new z(p);
    }

    @Override // com.google.android.play.core.internal.a0
    public final T e() {
        T t = (T) this.b;
        Object obj = c;
        if (t == obj) {
            synchronized (this) {
                t = this.b;
                if (t == obj) {
                    t = this.a.e();
                    Object obj2 = this.b;
                    if (obj2 != obj) {
                        if (obj2 != t) {
                            String valueOf = String.valueOf(obj2);
                            String valueOf2 = String.valueOf(t);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.b = t;
                    this.a = null;
                }
            }
        }
        return t;
    }
}
