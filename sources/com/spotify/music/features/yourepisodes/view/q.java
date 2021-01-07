package com.spotify.music.features.yourepisodes.view;

import com.spotify.encore.consumer.components.yourepisodes.api.yourepisodesheader.YourEpisodesHeader;
import com.spotify.music.features.yourepisodes.a0;
import kotlin.jvm.internal.h;

public final class q implements p {
    private final a0 a;
    private final k09 b;

    public q(a0 a0Var, k09 k09) {
        h.e(a0Var, "logger");
        h.e(k09, "adapterProvider");
        this.a = a0Var;
        this.b = k09;
    }

    @Override // com.spotify.music.features.yourepisodes.view.p
    public o a(a0 a0Var, YourEpisodesHeader yourEpisodesHeader) {
        h.e(a0Var, "views");
        h.e(yourEpisodesHeader, "headerViews");
        return new s(a0Var, yourEpisodesHeader, this.a, this.b);
    }
}
