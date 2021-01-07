package com.google.android.gms.cast;

import com.google.android.gms.cast.e;

final /* synthetic */ class u0 implements Runnable {
    private final k0 a;
    private final String b;
    private final String c;

    u0(k0 k0Var, String str, String str2) {
        this.a = k0Var;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e.d dVar;
        k0 k0Var = this.a;
        String str = this.b;
        String str2 = this.c;
        synchronized (k0Var.a.D) {
            dVar = k0Var.a.D.get(str);
        }
        if (dVar != null) {
            dVar.a(k0Var.a.B, str, str2);
        } else {
            z.G.a("Discarded message for unknown namespace '%s'", str);
        }
    }
}
