package defpackage;

import android.content.Context;

/* renamed from: dte  reason: default package */
public final class dte implements fjf<cte> {
    private final wlf<Context> a;

    public dte(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cte(this.a.get());
    }
}
