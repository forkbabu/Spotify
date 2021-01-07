package com.spotify.libs.connect.providers;

import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

final class n implements g {
    private final /* synthetic */ nmf a;

    n(nmf nmf) {
        this.a = nmf;
    }

    @Override // io.reactivex.functions.g
    public final /* synthetic */ void accept(Object obj) {
        h.d(this.a.invoke(obj), "invoke(...)");
    }
}
