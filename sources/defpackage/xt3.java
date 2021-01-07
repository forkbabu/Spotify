package defpackage;

import com.spotify.mobile.android.service.session.f;

/* renamed from: xt3  reason: default package */
public final class xt3 implements fjf<wt3> {
    private final wlf<f> a;
    private final wlf<cqe> b;

    public xt3(wlf<f> wlf, wlf<cqe> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wt3(this.a.get(), this.b.get());
    }
}
