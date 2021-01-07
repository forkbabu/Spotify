package com.spotify.music.libs.assistedcuration.presenter;

import com.google.common.base.Optional;
import com.spotify.playlist.endpoints.d;

public final class u implements fjf<t> {
    private final wlf<String> a;
    private final wlf<d> b;
    private final wlf<Optional<Integer>> c;

    public u(wlf<String> wlf, wlf<d> wlf2, wlf<Optional<Integer>> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t(this.a.get(), this.b.get(), this.c.get());
    }
}
