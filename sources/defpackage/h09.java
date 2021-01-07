package defpackage;

import com.spotify.music.features.yourepisodes.q;
import io.reactivex.y;

/* renamed from: h09  reason: default package */
public final class h09 implements fjf<g09> {
    private final wlf<pnc> a;
    private final wlf<q> b;
    private final wlf<lbb> c;
    private final wlf<y> d;

    public h09(wlf<pnc> wlf, wlf<q> wlf2, wlf<lbb> wlf3, wlf<y> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g09(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
