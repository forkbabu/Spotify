package com.spotify.music.features.profile.entity;

import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

final class p implements g {
    private final /* synthetic */ nmf a;

    p(nmf nmf) {
        this.a = nmf;
    }

    @Override // io.reactivex.functions.g
    public final /* synthetic */ void accept(Object obj) {
        h.d(this.a.invoke(obj), "invoke(...)");
    }
}
