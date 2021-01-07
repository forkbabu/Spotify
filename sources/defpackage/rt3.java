package defpackage;

import com.spotify.music.features.ads.h0;
import com.spotify.music.features.ads.i0;

/* renamed from: rt3  reason: default package */
public final class rt3 implements fjf<qt3> {
    private final wlf<h0> a;
    private final wlf<jz1> b;
    private final wlf<i0> c;
    private final wlf<pt3> d;

    public rt3(wlf<h0> wlf, wlf<jz1> wlf2, wlf<i0> wlf3, wlf<pt3> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qt3(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
