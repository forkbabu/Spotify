package defpackage;

import com.spotify.libs.search.history.i;

/* renamed from: l58  reason: default package */
public final class l58 implements fjf<k58> {
    private final wlf<hb8> a;
    private final wlf<j81> b;
    private final wlf<i> c;
    private final wlf<c8b> d;

    public l58(wlf<hb8> wlf, wlf<j81> wlf2, wlf<i> wlf3, wlf<c8b> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k58(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
