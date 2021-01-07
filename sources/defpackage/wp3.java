package defpackage;

import com.spotify.ubi.specification.factories.f;

/* renamed from: wp3  reason: default package */
public final class wp3 implements fjf<vp3> {
    private final wlf<ere> a;
    private final wlf<f> b;
    private final wlf<dv3> c;
    private final wlf<wb2> d;
    private final wlf<cqe> e;

    public wp3(wlf<ere> wlf, wlf<f> wlf2, wlf<dv3> wlf3, wlf<wb2> wlf4, wlf<cqe> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static wp3 a(wlf<ere> wlf, wlf<f> wlf2, wlf<dv3> wlf3, wlf<wb2> wlf4, wlf<cqe> wlf5) {
        return new wp3(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vp3(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
