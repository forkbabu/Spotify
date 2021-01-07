package defpackage;

import com.spotify.music.features.ads.model.Ad;
import com.spotify.player.model.ContextTrack;
import io.reactivex.g;

/* renamed from: a7c  reason: default package */
public final class a7c implements fjf<z6c> {
    private final wlf<g<Ad>> a;
    private final wlf<g<ContextTrack>> b;
    private final wlf<g<Long>> c;
    private final wlf<xp3> d;
    private final wlf<j7c> e;

    public a7c(wlf<g<Ad>> wlf, wlf<g<ContextTrack>> wlf2, wlf<g<Long>> wlf3, wlf<xp3> wlf4, wlf<j7c> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new z6c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
