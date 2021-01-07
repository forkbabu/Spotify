package defpackage;

import com.spotify.music.podcast.episode.util.DurationFormatter;
import com.squareup.picasso.Picasso;

/* renamed from: bs8  reason: default package */
public final class bs8 implements fjf<as8> {
    private final wlf<Picasso> a;
    private final wlf<DurationFormatter> b;
    private final wlf<mt8> c;

    public bs8(wlf<Picasso> wlf, wlf<DurationFormatter> wlf2, wlf<mt8> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new as8(this.a.get(), this.b.get(), this.c.get());
    }
}
