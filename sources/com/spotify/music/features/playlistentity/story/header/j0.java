package com.spotify.music.features.playlistentity.story.header;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

public final class j0 implements fjf<i0> {
    private final wlf<ImpressionLogger> a;
    private final wlf<InteractionLogger> b;
    private final wlf<yj6> c;
    private final wlf<ere> d;

    public j0(wlf<ImpressionLogger> wlf, wlf<InteractionLogger> wlf2, wlf<yj6> wlf3, wlf<ere> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i0(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
