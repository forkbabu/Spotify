package com.spotify.music.libs.collection.util;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.observable.o;

public final /* synthetic */ class b implements l {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Logger.d(((Throwable) obj).getMessage(), new Object[0]);
        return o.a;
    }
}
