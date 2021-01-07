package com.spotify.music.features.connectui.picker.frictionlessjoin;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.connectui.picker.frictionlessjoin.model.AvailableSession;
import io.reactivex.functions.l;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

final class b<T, R> implements l<Throwable, List<? extends AvailableSession>> {
    public static final b a = new b();

    b() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public List<? extends AvailableSession> apply(Throwable th) {
        Throwable th2 = th;
        h.e(th2, "it");
        Logger.d(th2.getMessage(), th2);
        return EmptyList.a;
    }
}
