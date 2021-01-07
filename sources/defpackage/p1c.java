package defpackage;

import android.content.Context;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position.i;

/* renamed from: p1c  reason: default package */
public final class p1c implements fjf<o1c> {
    private final wlf<Context> a;
    private final wlf<i> b;

    public p1c(wlf<Context> wlf, wlf<i> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o1c(this.a.get(), this.b.get());
    }
}
