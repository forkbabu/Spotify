package defpackage;

import com.spotify.music.carmode.nowplaying.common.view.voicebutton.c;
import com.spotify.music.carmode.nowplaying.podcast.view.speedbutton.d;
import com.spotify.nowplaying.ui.components.controls.seekbackward.h;
import com.spotify.nowplaying.ui.components.controls.seekforward.g;

/* renamed from: lq2  reason: default package */
public final class lq2 implements fjf<kq2> {
    private final wlf<no2> a;
    private final wlf<h> b;
    private final wlf<g> c;
    private final wlf<c> d;
    private final wlf<d> e;

    public lq2(wlf<no2> wlf, wlf<h> wlf2, wlf<g> wlf3, wlf<c> wlf4, wlf<d> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kq2(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
