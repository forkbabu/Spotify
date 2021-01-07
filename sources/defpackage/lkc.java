package defpackage;

import com.spotify.music.podcast.entity.adapter.episoderow.d;
import defpackage.zrc;

/* renamed from: lkc  reason: default package */
public final class lkc implements fjf<zrc.a> {
    private final wlf<d> a;

    public lkc(wlf<d> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return zrc.a.a(d.a.class, this.a.get());
    }
}
