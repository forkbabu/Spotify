package defpackage;

import android.content.Context;

/* renamed from: qic  reason: default package */
public final class qic implements fjf<pic> {
    private final wlf<Context> a;

    public qic(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pic(this.a.get());
    }
}
