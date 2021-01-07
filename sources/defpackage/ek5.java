package defpackage;

import com.spotify.music.features.home.common.cache.a;
import com.spotify.music.features.home.common.cache.b;
import com.spotify.music.features.home.common.datasource.h;
import com.spotify.music.features.home.common.datasource.j;
import io.reactivex.y;

/* renamed from: ek5  reason: default package */
public final class ek5 implements fjf<dk5> {
    private final wlf<y> a;
    private final wlf<Boolean> b;
    private final wlf<Boolean> c;
    private final wlf<nf5> d;
    private final wlf<h81> e;
    private final wlf<h> f;
    private final wlf<j> g;
    private final wlf<a<byte[]>> h;
    private final wlf<b> i;
    private final wlf<sxd> j;

    public ek5(wlf<y> wlf, wlf<Boolean> wlf2, wlf<Boolean> wlf3, wlf<nf5> wlf4, wlf<h81> wlf5, wlf<h> wlf6, wlf<j> wlf7, wlf<a<byte[]>> wlf8, wlf<b> wlf9, wlf<sxd> wlf10) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
    }

    public static ek5 a(wlf<y> wlf, wlf<Boolean> wlf2, wlf<Boolean> wlf3, wlf<nf5> wlf4, wlf<h81> wlf5, wlf<h> wlf6, wlf<j> wlf7, wlf<a<byte[]>> wlf8, wlf<b> wlf9, wlf<sxd> wlf10) {
        return new ek5(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9, wlf10);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dk5(this.a.get(), this.b.get().booleanValue(), this.c.get().booleanValue(), this.d.get(), this.e, this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
