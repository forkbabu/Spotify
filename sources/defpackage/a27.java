package defpackage;

import com.spotify.music.features.ads.i0;
import com.spotify.music.navigation.t;

/* renamed from: a27  reason: default package */
public final class a27 implements fjf<z17> {
    private final wlf<i0> a;
    private final wlf<t> b;

    public a27(wlf<i0> wlf, wlf<t> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new z17(this.a.get(), this.b.get());
    }
}
