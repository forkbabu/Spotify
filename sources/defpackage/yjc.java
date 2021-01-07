package defpackage;

import com.spotify.music.podcast.entity.adapter.episoderow.d;
import defpackage.zrc;

/* renamed from: yjc  reason: default package */
public final class yjc implements fjf<zrc.a> {
    private final wlf<d> a;

    public yjc(wlf<d> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return zrc.a.a(d.a.class, this.a.get());
    }
}
