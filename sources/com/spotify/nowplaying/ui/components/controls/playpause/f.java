package com.spotify.nowplaying.ui.components.controls.playpause;

import com.spotify.player.controls.d;
import io.reactivex.g;

public final class f implements fjf<e> {
    private final wlf<d> a;
    private final wlf<g<Boolean>> b;
    private final wlf<g<String>> c;
    private final wlf<d> d;

    public f(wlf<d> wlf, wlf<g<Boolean>> wlf2, wlf<g<String>> wlf3, wlf<d> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
