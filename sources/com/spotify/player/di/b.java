package com.spotify.player.di;

import com.spotify.cosmos.router.Request;
import io.reactivex.s;
import kotlin.jvm.internal.h;

final class b implements yj0 {
    private final /* synthetic */ nmf a;

    b(nmf nmf) {
        this.a = nmf;
    }

    @Override // defpackage.yj0
    public final /* synthetic */ s resolve(Request request) {
        h.e(request, "p0");
        return (s) this.a.invoke(request);
    }
}
