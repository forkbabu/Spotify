package defpackage;

import com.spotify.libs.search.history.i;

/* renamed from: n58  reason: default package */
public final class n58 implements fjf<m58> {
    private final wlf<i> a;
    private final wlf<mb8> b;
    private final wlf<c8b> c;

    public n58(wlf<i> wlf, wlf<mb8> wlf2, wlf<c8b> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m58(this.a.get(), this.b.get(), this.c.get());
    }
}
