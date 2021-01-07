package defpackage;

import android.content.Context;

/* renamed from: s1c  reason: default package */
public final class s1c implements fjf<r1c> {
    private final wlf<Context> a;
    private final wlf<u1c> b;
    private final wlf<t1c> c;

    public s1c(wlf<Context> wlf, wlf<u1c> wlf2, wlf<t1c> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r1c(this.a.get(), this.b.get(), this.c.get());
    }
}
