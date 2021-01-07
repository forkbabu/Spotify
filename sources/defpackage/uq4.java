package defpackage;

import android.content.Context;

/* renamed from: uq4  reason: default package */
public final class uq4 implements fjf<tq4> {
    private final wlf<Context> a;

    public uq4(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tq4(this.a.get());
    }
}
