package defpackage;

import android.content.Context;

/* renamed from: gvc  reason: default package */
public final class gvc implements fjf<fvc> {
    private final wlf<pvc> a;
    private final wlf<Context> b;

    public gvc(wlf<pvc> wlf, wlf<Context> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fvc(this.a.get(), this.b.get());
    }
}
