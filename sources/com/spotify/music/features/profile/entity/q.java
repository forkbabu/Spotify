package com.spotify.music.features.profile.entity;

import io.reactivex.functions.n;
import kotlin.jvm.internal.h;

final class q implements n {
    private final /* synthetic */ nmf a;

    q(nmf nmf) {
        this.a = nmf;
    }

    @Override // io.reactivex.functions.n
    public final /* synthetic */ boolean test(Object obj) {
        Object invoke = this.a.invoke(obj);
        h.d(invoke, "invoke(...)");
        return ((Boolean) invoke).booleanValue();
    }
}
