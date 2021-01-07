package com.spotify.music.features.podcast.entity.loadedpage.data;

import kotlin.jvm.internal.h;

public final class b {
    private final qyd a;
    private final onc b;
    private final boolean c;

    public b(qyd qyd, onc onc, boolean z) {
        h.e(qyd, "showEntity");
        h.e(onc, "podcastPlayerState");
        this.a = qyd;
        this.b = onc;
        this.c = z;
    }

    public final onc a() {
        return this.b;
    }

    public final qyd b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }
}
