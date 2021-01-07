package com.google.android.gms.internal.measurement;

/* access modifiers changed from: package-private */
public final class q2<T> implements p2<T> {
    private volatile p2<T> a;
    private volatile boolean b;
    private T c;

    q2(p2<T> p2Var) {
        p2Var.getClass();
        this.a = p2Var;
    }

    @Override // com.google.android.gms.internal.measurement.p2
    public final T a() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    T a2 = this.a.a();
                    this.c = a2;
                    this.b = true;
                    this.a = null;
                    return a2;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj == null) {
            String valueOf = String.valueOf(this.c);
            obj = je.j0(valueOf.length() + 25, "<supplier that returned ", valueOf, ">");
        }
        String valueOf2 = String.valueOf(obj);
        return je.j0(valueOf2.length() + 19, "Suppliers.memoize(", valueOf2, ")");
    }
}
