package defpackage;

import com.spotify.ubi.specification.factories.p4;

/* renamed from: vc9  reason: default package */
public final class vc9 implements fjf<uc9> {
    private final wlf<p4> a;
    private final wlf<ere> b;

    public vc9(wlf<p4> wlf, wlf<ere> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new uc9(this.a.get(), this.b.get());
    }
}
