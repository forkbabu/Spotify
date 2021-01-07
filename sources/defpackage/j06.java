package defpackage;

import com.spotify.ubi.specification.factories.m2;

/* renamed from: j06  reason: default package */
public final class j06 implements fjf<i06> {
    private final wlf<ere> a;
    private final wlf<m2> b;

    public j06(wlf<ere> wlf, wlf<m2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i06(this.a.get(), this.b.get());
    }
}
