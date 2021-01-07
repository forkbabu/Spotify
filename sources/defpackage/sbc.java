package defpackage;

import io.reactivex.s;

/* renamed from: sbc  reason: default package */
public final class sbc implements fjf<rbc> {
    private final wlf<s<Boolean>> a;
    private final wlf<s<Boolean>> b;

    public sbc(wlf<s<Boolean>> wlf, wlf<s<Boolean>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rbc(this.a.get(), this.b.get());
    }
}
