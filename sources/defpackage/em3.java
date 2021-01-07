package defpackage;

import com.spotify.music.features.ads.audioplus.overlay.c;
import com.spotify.music.features.ads.audioplus.overlay.g;
import com.squareup.picasso.Picasso;

/* renamed from: em3  reason: default package */
public final class em3 implements fjf<cm3> {
    private final wlf<Picasso> a;
    private final wlf<g> b;
    private final wlf<c> c;
    private final wlf<nu3> d;
    private final wlf<cqe> e;

    public em3(wlf<Picasso> wlf, wlf<g> wlf2, wlf<c> wlf3, wlf<nu3> wlf4, wlf<cqe> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        cm3 cm3 = new cm3();
        cm3.v = this.a.get();
        cm3.w = this.b.get();
        cm3.x = this.c.get();
        cm3.y = this.d.get();
        cm3.z = this.e.get();
        return cm3;
    }
}
