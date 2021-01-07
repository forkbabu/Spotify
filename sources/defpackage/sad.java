package defpackage;

import com.spotify.music.sociallistening.nearby.medium.NearbyMediumWifi;

/* renamed from: sad  reason: default package */
public final class sad implements fjf<oad> {
    private final wlf<NearbyMediumWifi> a;
    private final wlf<tad> b;
    private final wlf<w7d> c;
    private final wlf<f4d> d;

    public sad(wlf<NearbyMediumWifi> wlf, wlf<tad> wlf2, wlf<w7d> wlf3, wlf<f4d> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new oad(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
