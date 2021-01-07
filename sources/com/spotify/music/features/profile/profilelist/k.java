package com.spotify.music.features.profile.profilelist;

import com.spotify.music.navigation.t;
import io.reactivex.y;

public final class k implements fjf<j> {
    private final wlf<y> a;
    private final wlf<y> b;
    private final wlf<y> c;
    private final wlf<t> d;
    private final wlf<at7> e;

    public k(wlf<y> wlf, wlf<y> wlf2, wlf<y> wlf3, wlf<t> wlf4, wlf<at7> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
