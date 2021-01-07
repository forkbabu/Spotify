package defpackage;

import com.spotify.music.podcast.episode.util.DurationFormatter;

/* renamed from: dg8  reason: default package */
public final class dg8 implements fjf<cg8> {
    private final wlf<DurationFormatter> a;

    public dg8(wlf<DurationFormatter> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cg8(this.a.get());
    }
}
