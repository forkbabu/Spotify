package com.spotify.music.features.followfeed.network;

import io.reactivex.z;
import kotlin.jvm.internal.h;

public final class d implements c {
    private final f35 a;

    public d(f35 f35) {
        h.e(f35, "endPoint");
        this.a = f35;
    }

    @Override // com.spotify.music.features.followfeed.network.c
    public z<k35> a(String str) {
        return this.a.c(str);
    }
}
