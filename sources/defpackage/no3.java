package defpackage;

import com.spotify.music.features.ads.audioplus.topbanner.g;
import com.squareup.picasso.Picasso;

/* renamed from: no3  reason: default package */
public final class no3 implements fjf<mo3> {
    private final wlf<Picasso> a;
    private final wlf<g> b;
    private final wlf<nu3> c;

    public no3(wlf<Picasso> wlf, wlf<g> wlf2, wlf<nu3> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        mo3 mo3 = new mo3();
        mo3.f = this.a.get();
        mo3.g = this.b.get();
        mo3.h = this.c.get();
        return mo3;
    }
}
