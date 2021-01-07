package defpackage;

import com.spotify.share.cleanup.b;
import com.spotify.share.util.c;
import com.spotify.share.util.i;
import com.spotify.share.util.o;
import io.reactivex.y;

/* renamed from: f6e  reason: default package */
public final class f6e implements fjf<e6e> {
    private final wlf<y> a;
    private final wlf<y> b;
    private final wlf<i> c;
    private final wlf<c> d;
    private final wlf<x3e> e;
    private final wlf<o> f;
    private final wlf<b> g;

    public f6e(wlf<y> wlf, wlf<y> wlf2, wlf<i> wlf3, wlf<c> wlf4, wlf<x3e> wlf5, wlf<o> wlf6, wlf<b> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    public static e6e a(y yVar, y yVar2, i iVar, c cVar, x3e x3e, o oVar, b bVar) {
        return new e6e(yVar, yVar2, iVar, cVar, x3e, oVar, bVar);
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
