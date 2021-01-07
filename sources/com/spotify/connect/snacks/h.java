package com.spotify.connect.snacks;

import io.reactivex.functions.n;

final class h implements n {
    private final /* synthetic */ nmf a;

    h(nmf nmf) {
        this.a = nmf;
    }

    @Override // io.reactivex.functions.n
    public final /* synthetic */ boolean test(Object obj) {
        Object invoke = this.a.invoke(obj);
        kotlin.jvm.internal.h.d(invoke, "invoke(...)");
        return ((Boolean) invoke).booleanValue();
    }
}
