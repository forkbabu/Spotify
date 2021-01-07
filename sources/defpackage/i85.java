package defpackage;

import com.spotify.mobile.android.util.t;
import com.spotify.mobile.android.util.v;

/* renamed from: i85  reason: default package */
public final class i85 implements fjf<h85> {
    private final wlf<v> a;
    private final wlf<t> b;
    private final wlf<vxd> c;
    private final wlf<rf3> d;

    public i85(wlf<v> wlf, wlf<t> wlf2, wlf<vxd> wlf3, wlf<rf3> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h85(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
