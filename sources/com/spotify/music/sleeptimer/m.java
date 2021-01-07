package com.spotify.music.sleeptimer;

import com.spotify.player.model.ContextTrack;
import io.reactivex.s;
import io.reactivex.y;

public final class m implements fjf<l> {
    private final wlf<y> a;
    private final wlf<s<u3<String, ContextTrack>>> b;

    public m(wlf<y> wlf, wlf<s<u3<String, ContextTrack>>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l(this.a.get(), this.b.get());
    }
}
