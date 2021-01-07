package defpackage;

import defpackage.k1e;
import io.reactivex.w;

/* renamed from: xk5  reason: default package */
public final class xk5 implements fjf<k1e<b91>> {
    private final wlf<xf5> a;
    private final wlf<w<b91, b91>> b;
    private final wlf<w<b91, b91>> c;
    private final wlf<ml5> d;

    public xk5(wlf<xf5> wlf, wlf<w<b91, b91>> wlf2, wlf<w<b91, b91>> wlf3, wlf<ml5> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        k1e.b bVar = new k1e.b();
        bVar.a(this.a.get());
        bVar.a(this.c.get());
        bVar.a(this.b.get());
        bVar.a(this.d.get());
        return bVar.b();
    }
}
