package com.spotify.music.features.playlistallsongs.logging;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.ubi.specification.factories.j2;

public final class b implements fjf<PlaylistAllSongsLoggerImpl> {
    private final wlf<InteractionLogger> a;
    private final wlf<ImpressionLogger> b;
    private final wlf<j2> c;
    private final wlf<ere> d;

    public b(wlf<InteractionLogger> wlf, wlf<ImpressionLogger> wlf2, wlf<j2> wlf3, wlf<ere> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PlaylistAllSongsLoggerImpl(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
