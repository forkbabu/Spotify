package defpackage;

import com.spotify.share.cleanup.a;
import com.spotify.share.util.c;
import com.spotify.share.util.i;
import com.spotify.share.util.k;
import com.spotify.share.util.o;
import io.reactivex.y;

/* renamed from: g7e  reason: default package */
public final class g7e implements fjf<f7e> {
    private final wlf<y> a;
    private final wlf<y> b;
    private final wlf<i> c;
    private final wlf<c> d;
    private final wlf<x3e> e;
    private final wlf<o> f;
    private final wlf<a> g;
    private final wlf<gae> h;
    private final wlf<k> i;

    public g7e(wlf<y> wlf, wlf<y> wlf2, wlf<i> wlf3, wlf<c> wlf4, wlf<x3e> wlf5, wlf<o> wlf6, wlf<a> wlf7, wlf<gae> wlf8, wlf<k> wlf9) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
    }

    public static f7e a(y yVar, y yVar2, i iVar, c cVar, x3e x3e, o oVar, a aVar, gae gae, k kVar) {
        return new f7e(yVar, yVar2, iVar, cVar, x3e, oVar, aVar, gae, kVar);
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
