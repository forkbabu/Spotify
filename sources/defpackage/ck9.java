package defpackage;

import com.spotify.remoteconfig.d7;

/* renamed from: ck9  reason: default package */
public final class ck9 implements fjf<bk9> {
    private final wlf<d7> a;
    private final wlf<rj9> b;
    private final wlf<zj9> c;
    private final wlf<xj9> d;

    public ck9(wlf<d7> wlf, wlf<rj9> wlf2, wlf<zj9> wlf3, wlf<xj9> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bk9(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
