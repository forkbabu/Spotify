package defpackage;

import com.spotify.libs.connect.volume.l;
import com.spotify.music.libs.mediasession.m0;
import io.reactivex.y;

/* renamed from: yca  reason: default package */
public final class yca implements fjf<xca> {
    private final wlf<hba> a;
    private final wlf<l> b;
    private final wlf<vca> c;
    private final wlf<m0> d;
    private final wlf<bda> e;
    private final wlf<hv0> f;
    private final wlf<y> g;
    private final wlf<y> h;

    public yca(wlf<hba> wlf, wlf<l> wlf2, wlf<vca> wlf3, wlf<m0> wlf4, wlf<bda> wlf5, wlf<hv0> wlf6, wlf<y> wlf7, wlf<y> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xca(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
