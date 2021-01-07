package defpackage;

import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.features.podcast.episode.g0;

/* renamed from: ub7  reason: default package */
public final class ub7 implements fjf<tb7> {
    private final wlf<ExplicitContentFacade> a;
    private final wlf<cjc> b;
    private final wlf<oa7> c;
    private final wlf<String> d;
    private final wlf<g0> e;

    public ub7(wlf<ExplicitContentFacade> wlf, wlf<cjc> wlf2, wlf<oa7> wlf3, wlf<String> wlf4, wlf<g0> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tb7(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
