package defpackage;

import com.spotify.ubi.specification.factories.q3;

/* renamed from: vc8  reason: default package */
public final class vc8 implements fjf<uc8> {
    private final wlf<q3> a;

    public vc8(wlf<q3> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new uc8(this.a.get());
    }
}
