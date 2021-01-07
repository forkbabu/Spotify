package com.spotify.music.genie;

import io.reactivex.a;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.b;

public final /* synthetic */ class k implements l {
    public static final /* synthetic */ k a = new k();

    private /* synthetic */ k() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            return b.a;
        }
        return a.t(new Throwable("User not logged in"));
    }
}
