package defpackage;

import android.content.Context;

/* renamed from: qz3  reason: default package */
public final class qz3 implements fjf<pz3> {
    private final wlf<Context> a;

    public qz3(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pz3(this.a.get());
    }
}
