package defpackage;

import com.spotify.music.libs.viewuri.c;
import com.spotify.ubi.specification.factories.q3;

/* renamed from: cb8  reason: default package */
public final class cb8 implements fjf<bb8> {
    private final wlf<ere> a;
    private final wlf<q3> b;
    private final wlf<jz1> c;
    private final wlf<ifd> d;
    private final wlf<c.a> e;
    private final wlf<cqe> f;

    public cb8(wlf<ere> wlf, wlf<q3> wlf2, wlf<jz1> wlf3, wlf<ifd> wlf4, wlf<c.a> wlf5, wlf<cqe> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bb8(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
