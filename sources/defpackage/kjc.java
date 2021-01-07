package defpackage;

import com.spotify.music.libs.podcast.loader.o;

/* renamed from: kjc  reason: default package */
public final class kjc implements fjf<jjc> {
    private final wlf<o> a;

    public kjc(wlf<o> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jjc(this.a.get());
    }
}
