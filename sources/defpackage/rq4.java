package defpackage;

import com.spotify.remoteconfig.jj;

/* renamed from: rq4  reason: default package */
public final class rq4 implements fjf<qq4> {
    private final wlf<jj> a;
    private final wlf<qaa> b;

    public rq4(wlf<jj> wlf, wlf<qaa> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qq4(this.a.get(), this.b.get());
    }
}
