package defpackage;

import com.spotify.remoteconfig.x6;

/* renamed from: te5  reason: default package */
public final class te5 implements fjf<se5> {
    private final wlf<x6> a;
    private final wlf<ve5> b;

    public te5(wlf<x6> wlf, wlf<ve5> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new se5(this.a.get(), this.b.get());
    }
}
