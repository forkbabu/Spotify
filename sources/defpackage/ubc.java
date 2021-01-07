package defpackage;

import io.reactivex.s;

/* renamed from: ubc  reason: default package */
public final class ubc implements fjf<tbc> {
    private final wlf<s<Boolean>> a;
    private final wlf<s<Boolean>> b;
    private final wlf<s<Boolean>> c;

    public ubc(wlf<s<Boolean>> wlf, wlf<s<Boolean>> wlf2, wlf<s<Boolean>> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tbc(this.a.get(), this.b.get(), this.c.get());
    }
}
