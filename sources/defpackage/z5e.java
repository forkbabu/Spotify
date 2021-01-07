package defpackage;

import com.spotify.share.cleanup.a;
import com.spotify.share.util.c;
import com.spotify.share.util.i;
import com.spotify.share.util.o;
import io.reactivex.y;

/* renamed from: z5e  reason: default package */
public final class z5e implements fjf<y5e> {
    private final wlf<y> a;
    private final wlf<y> b;
    private final wlf<i> c;
    private final wlf<c> d;
    private final wlf<x3e> e;
    private final wlf<o> f;
    private final wlf<a> g;

    public z5e(wlf<y> wlf, wlf<y> wlf2, wlf<i> wlf3, wlf<c> wlf4, wlf<x3e> wlf5, wlf<o> wlf6, wlf<a> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    public static y5e a(y yVar, y yVar2, i iVar, c cVar, x3e x3e, o oVar, a aVar) {
        return new y5e(yVar, yVar2, iVar, cVar, x3e, oVar, aVar);
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
