package com.google.android.gms.cast.internal;

import com.google.android.gms.cast.e;

final class i0 implements Runnable {
    private final /* synthetic */ d0 a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;

    i0(d0 d0Var, String str, String str2) {
        this.a = d0Var;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e.d dVar;
        synchronized (this.a.O) {
            dVar = (e.d) this.a.O.get(this.b);
        }
        if (dVar != null) {
            dVar.a(this.a.M, this.b, this.c);
        } else {
            d0.e0.a("Discarded message for unknown namespace '%s'", this.b);
        }
    }
}
