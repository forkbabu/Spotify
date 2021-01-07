package defpackage;

import com.spotify.music.podcast.entity.adapter.episoderow.k;

/* renamed from: hkc  reason: default package */
public final class hkc implements fjf<gkc> {
    private final wlf<Boolean> a;
    private final wlf<k> b;

    public hkc(wlf<Boolean> wlf, wlf<k> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gkc(this.a.get().booleanValue(), this.b.get());
    }
}
