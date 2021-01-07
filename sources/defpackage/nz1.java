package defpackage;

import android.content.Context;

/* renamed from: nz1  reason: default package */
public final class nz1 implements fjf<mz1> {
    private final wlf<Context> a;

    public nz1(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mz1(this.a.get());
    }
}
