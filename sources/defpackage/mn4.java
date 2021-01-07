package defpackage;

import com.spotify.libs.connect.instrumentation.e;

/* renamed from: mn4  reason: default package */
public final class mn4 implements fjf<ln4> {
    private final wlf<qp4> a;
    private final wlf<bq4> b;
    private final wlf<dq4> c;
    private final wlf<zp4> d;
    private final wlf<e> e;

    public mn4(wlf<qp4> wlf, wlf<bq4> wlf2, wlf<dq4> wlf3, wlf<zp4> wlf4, wlf<e> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ln4(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
