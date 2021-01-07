package defpackage;

import com.spotify.playlist.endpoints.p;

/* renamed from: nj3  reason: default package */
public final class nj3 implements fjf<mj3> {
    private final wlf<p> a;
    private final wlf<pj3> b;
    private final wlf<di3> c;

    public nj3(wlf<p> wlf, wlf<pj3> wlf2, wlf<di3> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mj3(this.a.get(), this.b.get(), this.c.get());
    }
}
