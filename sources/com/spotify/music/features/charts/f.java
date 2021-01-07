package com.spotify.music.features.charts;

import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class f implements g {
    private final /* synthetic */ nmf a;

    f(nmf nmf) {
        this.a = nmf;
    }

    @Override // io.reactivex.functions.g
    public final /* synthetic */ void accept(Object obj) {
        h.d(this.a.invoke(obj), "invoke(...)");
    }
}
