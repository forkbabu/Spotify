package com.spotify.libs.connect.providers;

import io.reactivex.functions.n;
import kotlin.jvm.internal.h;

final class k implements n {
    private final /* synthetic */ nmf a;

    k(nmf nmf) {
        this.a = nmf;
    }

    @Override // io.reactivex.functions.n
    public final /* synthetic */ boolean test(Object obj) {
        Object invoke = this.a.invoke(obj);
        h.d(invoke, "invoke(...)");
        return ((Boolean) invoke).booleanValue();
    }
}
