package defpackage;

import android.content.Context;

/* renamed from: ir4  reason: default package */
public final class ir4 implements fjf<hr4> {
    private final wlf<Context> a;

    public ir4(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hr4(this.a.get());
    }
}
