package com.spotify.music.features.pushnotifications;

import io.reactivex.a;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.b;
import retrofit2.v;

public final /* synthetic */ class c0 implements l {
    public static final /* synthetic */ c0 a = new c0();

    private /* synthetic */ c0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        if (((v) obj).f()) {
            return b.a;
        }
        return a.t(new Throwable());
    }
}
