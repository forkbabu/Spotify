package com.spotify.music.features.search.mobius;

import com.spotify.mobile.android.rx.w;
import io.reactivex.s;

public final class m0 implements fjf<s<txa>> {
    private final wlf<w> a;
    private final wlf<oz0> b;

    public m0(wlf<w> wlf, wlf<oz0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().b().j0(a.a).E().j0(new e(this.b.get()));
    }
}
