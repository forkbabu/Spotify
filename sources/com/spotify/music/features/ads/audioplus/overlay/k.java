package com.spotify.music.features.ads.audioplus.overlay;

import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.ads.audioplus.overlay.brandads.r;
import com.spotify.music.features.ads.audioplus.overlay.brandads.t;

public class k {
    private final ImmutableList<j> a;
    private final wlf<t> b;
    private final jp3 c;

    public k(wlf<t> wlf, wlf<r> wlf2, wlf<ym3> wlf3, wlf<fn3> wlf4, wlf<fm3> wlf5, jp3 jp3) {
        this.c = jp3;
        this.b = wlf;
        this.a = ImmutableList.of((fm3) wlf2.get(), (fm3) wlf3.get(), (fm3) wlf4.get(), wlf5.get());
    }

    public j a(String str) {
        Optional optional;
        if (this.c.e()) {
            optional = FluentIterable.from(this.a).firstMatch(new a(str));
        } else {
            optional = Optional.of(this.b.get());
        }
        return (j) optional.orNull();
    }
}
