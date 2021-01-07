package com.spotify.music;

import com.spotify.android.flags.c;
import io.reactivex.g;
import io.reactivex.y;

public final class e0 implements fjf<d0> {
    private final wlf<vgb> a;
    private final wlf<y> b;
    private final wlf<g<c>> c;

    public e0(wlf<vgb> wlf, wlf<y> wlf2, wlf<g<c>> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d0(this.a.get(), this.b.get(), this.c.get());
    }
}
