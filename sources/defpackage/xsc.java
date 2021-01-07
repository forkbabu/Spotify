package defpackage;

import com.spotify.ubi.specification.factories.s2;
import com.spotify.ubi.specification.factories.x2;

/* renamed from: xsc  reason: default package */
public final class xsc implements fjf<wsc> {
    private final wlf<ere> a;
    private final wlf<s2> b;
    private final wlf<x2> c;

    public xsc(wlf<ere> wlf, wlf<s2> wlf2, wlf<x2> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wsc(this.a.get(), this.b.get(), this.c.get());
    }
}
