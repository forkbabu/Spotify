package com.spotify.music.libs.carmodeengine.util;

import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

final class u implements g {
    private final /* synthetic */ nmf a;

    u(nmf nmf) {
        this.a = nmf;
    }

    @Override // io.reactivex.functions.g
    public final /* synthetic */ void accept(Object obj) {
        h.d(this.a.invoke(obj), "invoke(...)");
    }
}
