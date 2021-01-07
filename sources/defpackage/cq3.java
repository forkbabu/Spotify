package defpackage;

import com.spotify.ubi.specification.factories.f;

/* renamed from: cq3  reason: default package */
public final class cq3 implements fjf<bq3> {
    private final wlf<ere> a;
    private final wlf<f> b;
    private final wlf<dv3> c;
    private final wlf<wb2> d;
    private final wlf<cqe> e;

    public cq3(wlf<ere> wlf, wlf<f> wlf2, wlf<dv3> wlf3, wlf<wb2> wlf4, wlf<cqe> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static cq3 a(wlf<ere> wlf, wlf<f> wlf2, wlf<dv3> wlf3, wlf<wb2> wlf4, wlf<cqe> wlf5) {
        return new cq3(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bq3(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
