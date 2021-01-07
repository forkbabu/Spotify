package com.spotify.music.features.ads;

import io.reactivex.functions.l;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;

public final /* synthetic */ class n implements l {
    public final /* synthetic */ s a;

    public /* synthetic */ n(s sVar) {
        this.a = sVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((Boolean) obj).booleanValue() ? this.a : o.a;
    }
}
