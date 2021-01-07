package defpackage;

import com.spotify.music.carmode.nowplaying.common.view.voicebutton.c;
import com.spotify.music.carmode.nowplaying.def.view.repeat.b;
import com.spotify.music.nowplaying.common.view.heart.g;
import com.spotify.nowplaying.ui.components.controls.next.f;
import com.spotify.nowplaying.ui.components.controls.previous.e;
import com.spotify.nowplaying.ui.components.shuffle.d;

/* renamed from: ip2  reason: default package */
public final class ip2 implements fjf<hp2> {
    private final wlf<no2> a;
    private final wlf<e> b;
    private final wlf<f> c;
    private final wlf<d> d;
    private final wlf<g> e;
    private final wlf<c> f;
    private final wlf<b> g;

    public ip2(wlf<no2> wlf, wlf<e> wlf2, wlf<f> wlf3, wlf<d> wlf4, wlf<g> wlf5, wlf<c> wlf6, wlf<b> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hp2(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
