package defpackage;

import com.spotify.music.features.ads.audioplus.topbanner.d;
import com.spotify.music.features.ads.audioplus.topbanner.g;
import com.squareup.picasso.Picasso;

/* renamed from: to3  reason: default package */
public final class to3 implements fjf<so3> {
    private final wlf<Picasso> a;
    private final wlf<d> b;
    private final wlf<g> c;
    private final wlf<nu3> d;

    public to3(wlf<Picasso> wlf, wlf<d> wlf2, wlf<g> wlf3, wlf<nu3> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        so3 so3 = new so3();
        so3.j = this.a.get();
        so3.k = this.b.get();
        so3.l = this.c.get();
        so3.m = this.d.get();
        return so3;
    }
}
