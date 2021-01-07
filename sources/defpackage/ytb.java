package defpackage;

import com.spotify.music.nowplaying.core.navcontext.f;
import com.spotify.music.nowplaying.core.navcontext.h;
import io.reactivex.g;

/* renamed from: ytb  reason: default package */
public final class ytb implements fjf<g<f>> {
    private final wlf<h> a;

    public ytb(wlf<h> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().a();
    }
}
