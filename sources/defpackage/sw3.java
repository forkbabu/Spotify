package defpackage;

import com.spotify.ubi.specification.factories.s0;

/* renamed from: sw3  reason: default package */
public final class sw3 implements fjf<rw3> {
    private final wlf<ere> a;
    private final wlf<s0> b;

    public sw3(wlf<ere> wlf, wlf<s0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rw3(this.a.get(), this.b.get());
    }
}
