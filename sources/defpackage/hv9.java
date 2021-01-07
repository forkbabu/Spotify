package defpackage;

import com.spotify.mobile.android.util.k0;
import defpackage.ov9;

/* renamed from: hv9  reason: default package */
public final class hv9 implements fjf<gv9> {
    private final wlf<k0> a;
    private final wlf<ov9.a> b;

    public hv9(wlf<k0> wlf, wlf<ov9.a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gv9(this.a.get(), this.b.get());
    }
}
