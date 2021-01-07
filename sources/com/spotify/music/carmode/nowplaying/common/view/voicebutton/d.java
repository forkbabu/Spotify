package com.spotify.music.carmode.nowplaying.common.view.voicebutton;

import com.spotify.music.libs.carmodeengine.util.y;
import com.spotify.music.navigation.t;
import io.reactivex.s;

public final class d implements fjf<c> {
    private final wlf<uo2> a;
    private final wlf<t> b;
    private final wlf<y> c;
    private final wlf<s<Boolean>> d;
    private final wlf<io.reactivex.y> e;

    public d(wlf<uo2> wlf, wlf<t> wlf2, wlf<y> wlf3, wlf<s<Boolean>> wlf4, wlf<io.reactivex.y> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static d a(wlf<uo2> wlf, wlf<t> wlf2, wlf<y> wlf3, wlf<s<Boolean>> wlf4, wlf<io.reactivex.y> wlf5) {
        return new d(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
