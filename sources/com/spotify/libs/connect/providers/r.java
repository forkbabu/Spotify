package com.spotify.libs.connect.providers;

import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

final class r implements g {
    private final /* synthetic */ nmf a;

    r(nmf nmf) {
        this.a = nmf;
    }

    @Override // io.reactivex.functions.g
    public final /* synthetic */ void accept(Object obj) {
        h.d(this.a.invoke(obj), "invoke(...)");
    }
}
