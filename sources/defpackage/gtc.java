package defpackage;

import com.spotify.music.libs.viewuri.c;
import com.spotify.music.podcastentityrow.s;

/* renamed from: gtc  reason: default package */
public final class gtc implements fjf<ftc> {
    private final wlf<c> a;
    private final wlf<s> b;

    public gtc(wlf<c> wlf, wlf<s> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ftc(this.a.get(), this.b.get());
    }
}
