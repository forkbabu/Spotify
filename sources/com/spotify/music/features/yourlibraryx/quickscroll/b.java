package com.spotify.music.features.yourlibraryx.quickscroll;

import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

final class b implements g {
    private final /* synthetic */ nmf a;

    b(nmf nmf) {
        this.a = nmf;
    }

    @Override // io.reactivex.functions.g
    public final /* synthetic */ void accept(Object obj) {
        h.d(this.a.invoke(obj), "invoke(...)");
    }
}
