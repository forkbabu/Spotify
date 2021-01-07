package defpackage;

import android.content.Context;

/* renamed from: si  reason: default package */
public final class si implements fjf<ri> {
    private final wlf<Context> a;
    private final wlf<String> b;
    private final wlf<Integer> c;

    public si(wlf<Context> wlf, wlf<String> wlf2, wlf<Integer> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ri(this.a.get(), this.b.get(), this.c.get().intValue());
    }
}
