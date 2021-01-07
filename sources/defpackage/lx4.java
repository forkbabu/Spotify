package defpackage;

import android.content.Context;

/* renamed from: lx4  reason: default package */
public final class lx4 implements fjf<kx4> {
    private final wlf<Context> a;

    public lx4(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kx4(this.a.get());
    }
}
