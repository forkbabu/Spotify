package com.spotify.music.playlist.extender;

import com.spotify.http.u;

public final class o0 implements fjf<s0> {
    private final wlf<u> a;

    public o0(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        s0 s0Var = (s0) this.a.get().c(s0.class);
        yif.g(s0Var, "Cannot return null from a non-@Nullable @Provides method");
        return s0Var;
    }
}
