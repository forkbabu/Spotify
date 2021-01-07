package defpackage;

import com.spotify.libs.connect.instrumentation.e;

/* renamed from: wn4  reason: default package */
public final class wn4 implements fjf<vn4> {
    private final wlf<qp4> a;
    private final wlf<bq4> b;
    private final wlf<dq4> c;
    private final wlf<e> d;

    public wn4(wlf<qp4> wlf, wlf<bq4> wlf2, wlf<dq4> wlf3, wlf<e> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vn4(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
