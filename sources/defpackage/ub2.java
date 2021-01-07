package defpackage;

import com.spotify.mobile.android.waze.model.b;

/* renamed from: ub2  reason: default package */
public final class ub2 implements fjf<tb2> {
    private final wlf<b> a;
    private final wlf<vla> b;

    public ub2(wlf<b> wlf, wlf<vla> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tb2(this.a.get(), this.b.get());
    }
}
