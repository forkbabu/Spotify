package com.spotify.music.playlist.extender;

import com.spotify.music.libs.viewuri.c;
import com.spotify.player.model.PlayOrigin;

public final class n0 implements fjf<PlayOrigin> {
    private final wlf<c> a;
    private final wlf<yn0> b;

    public n0(wlf<c> wlf, wlf<yn0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        PlayOrigin build = PlayOrigin.builder(kfd.N0.getName()).referrerIdentifier(this.b.get().getName()).viewUri(this.a.get().toString()).build();
        yif.g(build, "Cannot return null from a non-@Nullable @Provides method");
        return build;
    }
}
