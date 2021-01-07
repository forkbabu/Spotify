package defpackage;

import android.content.Context;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a;

/* renamed from: x1c  reason: default package */
public final class x1c implements fjf<w1c> {
    private final wlf<Context> a;
    private final wlf<jzc> b;
    private final wlf<a> c;
    private final wlf<e1c> d;

    public x1c(wlf<Context> wlf, wlf<jzc> wlf2, wlf<a> wlf3, wlf<e1c> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w1c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
