package com.spotify.music.features.renameplaylist;

import com.spotify.instrumentation.a;
import com.spotify.music.loggers.InteractionLogger;

public final class c implements fjf<RenamePlaylistLogger> {
    private final wlf<n48> a;
    private final wlf<ere> b;
    private final wlf<InteractionLogger> c;
    private final wlf<a> d;

    public c(wlf<n48> wlf, wlf<ere> wlf2, wlf<InteractionLogger> wlf3, wlf<a> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new RenamePlaylistLogger(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
