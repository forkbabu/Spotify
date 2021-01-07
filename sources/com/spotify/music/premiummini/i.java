package com.spotify.music.premiummini;

import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

final class i implements g {
    private final /* synthetic */ nmf a;

    i(nmf nmf) {
        this.a = nmf;
    }

    @Override // io.reactivex.functions.g
    public final /* synthetic */ void accept(Object obj) {
        h.d(this.a.invoke(obj), "invoke(...)");
    }
}
