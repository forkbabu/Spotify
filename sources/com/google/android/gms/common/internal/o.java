package com.google.android.gms.common.internal;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

public final class o {
    private static o b;
    private static final p c = new p(0, false, false, 0, 0);
    private p a;

    private o() {
    }

    @RecentlyNonNull
    public static synchronized o b() {
        o oVar;
        synchronized (o.class) {
            if (b == null) {
                b = new o();
            }
            oVar = b;
        }
        return oVar;
    }

    @RecentlyNullable
    public final p a() {
        return this.a;
    }

    public final synchronized void c(p pVar) {
        if (pVar == null) {
            this.a = c;
            return;
        }
        p pVar2 = this.a;
        if (pVar2 == null || pVar2.q2() < pVar.q2()) {
            this.a = pVar;
        }
    }
}
