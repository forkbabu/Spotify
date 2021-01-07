package com.spotify.libs.connect.volume;

import kotlin.jvm.internal.h;

final class n implements io.reactivex.functions.n {
    private final /* synthetic */ nmf a;

    n(nmf nmf) {
        this.a = nmf;
    }

    @Override // io.reactivex.functions.n
    public final /* synthetic */ boolean test(Object obj) {
        Object invoke = this.a.invoke(obj);
        h.d(invoke, "invoke(...)");
        return ((Boolean) invoke).booleanValue();
    }
}
