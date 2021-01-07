package defpackage;

import android.content.Context;

/* renamed from: eid  reason: default package */
public final class eid implements fjf<did> {
    private final wlf<Context> a;
    private final wlf<yyd> b;
    private final wlf<hid> c;
    private final wlf<jwc> d;
    private final wlf<oq0> e;

    public eid(wlf<Context> wlf, wlf<yyd> wlf2, wlf<hid> wlf3, wlf<jwc> wlf4, wlf<oq0> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new did(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
