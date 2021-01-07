package com.spotify.music.features.followfeed.mobius.effecthandlers;

import com.spotify.music.features.followfeed.network.c;
import io.reactivex.functions.l;
import java.util.List;

public final class h implements fjf<g> {
    private final wlf<c> a;
    private final wlf<l<k35, List<p25>>> b;

    public h(wlf<c> wlf, wlf<l<k35, List<p25>>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get(), this.b.get());
    }
}
