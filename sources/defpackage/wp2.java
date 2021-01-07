package defpackage;

import com.spotify.music.carmode.nowplaying.common.view.voicebutton.c;
import com.spotify.music.nowplaying.common.view.heart.g;
import com.spotify.nowplaying.ui.components.controls.next.f;
import com.spotify.nowplaying.ui.components.controls.previous.e;

/* renamed from: wp2  reason: default package */
public final class wp2 implements fjf<vp2> {
    private final wlf<no2> a;
    private final wlf<e> b;
    private final wlf<f> c;
    private final wlf<g> d;
    private final wlf<com.spotify.music.nowplaying.common.view.ban.e> e;
    private final wlf<c> f;

    public wp2(wlf<no2> wlf, wlf<e> wlf2, wlf<f> wlf3, wlf<g> wlf4, wlf<com.spotify.music.nowplaying.common.view.ban.e> wlf5, wlf<c> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vp2(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
