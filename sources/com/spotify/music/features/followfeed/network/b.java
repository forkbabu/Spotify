package com.spotify.music.features.followfeed.network;

import io.reactivex.a;
import kotlin.jvm.internal.h;

public final class b implements a {
    private final f35 a;

    public b(f35 f35) {
        h.e(f35, "followFeedV1Endpoint");
        this.a = f35;
    }

    @Override // com.spotify.music.features.followfeed.network.a
    public a a(String str) {
        h.e(str, "artistUri");
        return this.a.a(new DismissRequest(str));
    }
}
