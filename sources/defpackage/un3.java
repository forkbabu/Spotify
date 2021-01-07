package defpackage;

import com.spotify.music.features.ads.audioplus.topbanner.carousel.b;

/* renamed from: un3  reason: default package */
public final class un3 implements fjf<tn3> {
    private final wlf<b> a;
    private final wlf<zn3> b;

    public un3(wlf<b> wlf, wlf<zn3> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tn3(this.a.get(), this.b.get());
    }
}
