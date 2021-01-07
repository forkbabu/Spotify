package com.spotify.music.libs.connect.access;

import com.spotify.music.libs.connect.access.animation.logic.NudgeResolver;
import io.reactivex.s;
import io.reactivex.y;

public final class t implements fjf<ConnectAccessViewModel> {
    private final wlf<o> a;
    private final wlf<r> b;
    private final wlf<qba> c;
    private final wlf<hba> d;
    private final wlf<y> e;
    private final wlf<mba> f;
    private final wlf<NudgeResolver> g;
    private final wlf<s<Boolean>> h;

    public t(wlf<o> wlf, wlf<r> wlf2, wlf<qba> wlf3, wlf<hba> wlf4, wlf<y> wlf5, wlf<mba> wlf6, wlf<NudgeResolver> wlf7, wlf<s<Boolean>> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ConnectAccessViewModel(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
