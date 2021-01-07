package defpackage;

import com.spotify.mobile.android.util.ui.k;
import com.spotify.music.libs.performance.tracking.h0;
import com.spotify.music.libs.viewuri.c;

/* renamed from: ad8  reason: default package */
public final class ad8 implements fjf<zc8> {
    private final wlf<k> a;
    private final wlf<h0> b;
    private final wlf<c> c;
    private final wlf<ij9> d;

    public ad8(wlf<k> wlf, wlf<h0> wlf2, wlf<c> wlf3, wlf<ij9> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zc8(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
