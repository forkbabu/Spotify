package defpackage;

import com.spotify.ubi.specification.factories.a1;

/* renamed from: xb4  reason: default package */
public final class xb4 implements fjf<wb4> {
    private final wlf<zab> a;
    private final wlf<a1> b;
    private final wlf<ere> c;

    public xb4(wlf<zab> wlf, wlf<a1> wlf2, wlf<ere> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wb4(this.a.get(), this.b.get(), this.c.get());
    }
}
