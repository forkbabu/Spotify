package defpackage;

import com.spotify.music.libs.podcast.chartsv2.d;
import io.reactivex.y;

/* renamed from: kma  reason: default package */
public final class kma implements fjf<d> {
    private final wlf<nma> a;
    private final wlf<gna> b;
    private final wlf<y> c;

    public kma(wlf<nma> wlf, wlf<gna> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get(), this.b.get(), this.c.get());
    }
}
