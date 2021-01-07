package defpackage;

import com.spotify.share.cleanup.a;
import com.spotify.share.util.c;
import com.spotify.share.util.i;
import com.spotify.share.util.o;
import com.spotify.share.util.q;
import io.reactivex.y;

/* renamed from: c6e  reason: default package */
public final class c6e implements fjf<b6e> {
    private final wlf<y> a;
    private final wlf<y> b;
    private final wlf<i> c;
    private final wlf<c> d;
    private final wlf<x3e> e;
    private final wlf<q> f;
    private final wlf<o> g;
    private final wlf<a> h;

    public c6e(wlf<y> wlf, wlf<y> wlf2, wlf<i> wlf3, wlf<c> wlf4, wlf<x3e> wlf5, wlf<q> wlf6, wlf<o> wlf7, wlf<a> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    public static b6e a(y yVar, y yVar2, i iVar, c cVar, x3e x3e, q qVar, o oVar, a aVar) {
        return new b6e(yVar, yVar2, iVar, cVar, x3e, qVar, oVar, aVar);
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
