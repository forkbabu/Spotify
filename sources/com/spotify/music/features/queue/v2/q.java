package com.spotify.music.features.queue.v2;

import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

final class q implements g {
    private final /* synthetic */ nmf a;

    q(nmf nmf) {
        this.a = nmf;
    }

    @Override // io.reactivex.functions.g
    public final /* synthetic */ void accept(Object obj) {
        h.d(this.a.invoke(obj), "invoke(...)");
    }
}
