package com.spotify.music.features.spoton;

import com.spotify.music.features.spoton.exceptions.SpotOnLoggedOutException;
import io.reactivex.a;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.b;

public final /* synthetic */ class h implements l {
    public static final /* synthetic */ h a = new h();

    private /* synthetic */ h() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            return b.a;
        }
        return a.t(new SpotOnLoggedOutException());
    }
}
