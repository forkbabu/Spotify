package defpackage;

import com.spotify.mobile.android.util.ui.k;

/* renamed from: nz3  reason: default package */
public final class nz3 implements fjf<mz3> {
    private final wlf<k> a;
    private final wlf<yx3> b;

    public nz3(wlf<k> wlf, wlf<yx3> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mz3(this.a.get(), this.b.get());
    }
}
