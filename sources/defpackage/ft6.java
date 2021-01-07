package defpackage;

import com.spotify.music.features.playlistentity.story.header.h0;
import com.spotify.music.features.playlistentity.story.header.p0;

/* renamed from: ft6  reason: default package */
public final class ft6 implements fjf<et6> {
    private final wlf<kt6> a;
    private final wlf<p0.a> b;
    private final wlf<ei6> c;
    private final wlf<h0> d;
    private final wlf<String> e;

    public ft6(wlf<kt6> wlf, wlf<p0.a> wlf2, wlf<ei6> wlf3, wlf<h0> wlf4, wlf<String> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new et6(this.a, this.b, this.c, this.d, this.e);
    }
}
