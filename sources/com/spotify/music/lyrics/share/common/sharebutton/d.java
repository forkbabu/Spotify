package com.spotify.music.lyrics.share.common.sharebutton;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

public final class d implements fjf<b> {
    private final wlf<wdb> a;
    private final wlf<seb> b;
    private final wlf<afb> c;
    private final wlf<g<PlayerState>> d;
    private final wlf<y> e;

    public d(wlf<wdb> wlf, wlf<seb> wlf2, wlf<afb> wlf3, wlf<g<PlayerState>> wlf4, wlf<y> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static d a(wlf<wdb> wlf, wlf<seb> wlf2, wlf<afb> wlf3, wlf<g<PlayerState>> wlf4, wlf<y> wlf5) {
        return new d(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
