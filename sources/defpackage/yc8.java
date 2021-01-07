package defpackage;

import com.spotify.mobile.android.util.ui.k;
import com.spotify.music.libs.performance.tracking.h0;
import com.spotify.music.libs.viewuri.c;

/* renamed from: yc8  reason: default package */
public final class yc8 implements fjf<xc8> {
    private final wlf<k> a;
    private final wlf<h0> b;
    private final wlf<ij9> c;
    private final wlf<c> d;

    public yc8(wlf<k> wlf, wlf<h0> wlf2, wlf<ij9> wlf3, wlf<c> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xc8(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
