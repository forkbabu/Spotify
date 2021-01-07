package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* access modifiers changed from: package-private */
public final class zzed<T> implements p2<T>, Serializable {
    private volatile transient boolean a;
    private transient T b;
    private final p2<T> zza;

    zzed(p2<T> p2Var) {
        p2Var.getClass();
        this.zza = p2Var;
    }

    @Override // com.google.android.gms.internal.measurement.p2
    public final T a() {
        if (!this.a) {
            synchronized (this) {
                if (!this.a) {
                    T a2 = this.zza.a();
                    this.b = a2;
                    this.a = true;
                    return a2;
                }
            }
        }
        return this.b;
    }

    @Override // java.lang.Object
    public final String toString() {
        Object obj;
        if (this.a) {
            String valueOf = String.valueOf(this.b);
            obj = je.j0(valueOf.length() + 25, "<supplier that returned ", valueOf, ">");
        } else {
            obj = this.zza;
        }
        String valueOf2 = String.valueOf(obj);
        return je.j0(valueOf2.length() + 19, "Suppliers.memoize(", valueOf2, ")");
    }
}
