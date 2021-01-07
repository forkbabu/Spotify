package defpackage;

import defpackage.k1e;
import io.reactivex.w;

/* renamed from: lk5  reason: default package */
public final class lk5 implements fjf<k1e<b91>> {
    private final wlf<ok5> a;
    private final wlf<xf5> b;
    private final wlf<w<b91, b91>> c;
    private final wlf<w<b91, b91>> d;
    private final wlf<ml5> e;

    public lk5(wlf<ok5> wlf, wlf<xf5> wlf2, wlf<w<b91, b91>> wlf3, wlf<w<b91, b91>> wlf4, wlf<ml5> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        k1e.b bVar = new k1e.b();
        bVar.a(this.a.get());
        bVar.a(this.b.get());
        bVar.a(this.d.get());
        bVar.a(this.c.get());
        bVar.a(this.e.get());
        return bVar.b();
    }
}
