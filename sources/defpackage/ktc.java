package defpackage;

import com.spotify.music.podcast.episode.util.j;

/* renamed from: ktc  reason: default package */
public final class ktc implements fjf<jtc> {
    private final wlf<j> a;

    public ktc(wlf<j> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jtc(this.a.get());
    }
}
