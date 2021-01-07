package defpackage;

import com.spotify.music.podcast.episode.util.j;

/* renamed from: dmc  reason: default package */
public final class dmc implements fjf<cmc> {
    private final wlf<j> a;

    public dmc(wlf<j> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cmc(this.a.get());
    }
}
