package defpackage;

import com.spotify.music.libs.podcast.loader.o;

/* renamed from: ljc  reason: default package */
public final class ljc implements fjf<ijc> {
    private final wlf<o> a;

    public ljc(wlf<o> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ijc(this.a.get());
    }
}
