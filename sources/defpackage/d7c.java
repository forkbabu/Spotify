package defpackage;

import com.spotify.ads.uicomponents.secondaryintent.e;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.player.model.ContextTrack;
import io.reactivex.g;

/* renamed from: d7c  reason: default package */
public final class d7c implements fjf<c7c> {
    private final wlf<g<ContextTrack>> a;
    private final wlf<vp3> b;
    private final wlf<bq3> c;
    private final wlf<g<Ad>> d;
    private final wlf<ws3> e;
    private final wlf<e> f;

    public d7c(wlf<g<ContextTrack>> wlf, wlf<vp3> wlf2, wlf<bq3> wlf3, wlf<g<Ad>> wlf4, wlf<ws3> wlf5, wlf<e> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c7c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
