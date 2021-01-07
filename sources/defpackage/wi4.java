package defpackage;

import com.spotify.ubi.specification.factories.w;
import com.spotify.ubi.specification.factories.x;

/* renamed from: wi4  reason: default package */
public final class wi4 implements fjf<vi4> {
    private final wlf<ere> a;
    private final wlf<w> b;
    private final wlf<x> c;

    public wi4(wlf<ere> wlf, wlf<w> wlf2, wlf<x> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vi4(this.a.get(), this.b.get(), this.c.get());
    }
}
