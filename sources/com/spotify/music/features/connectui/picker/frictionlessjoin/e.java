package com.spotify.music.features.connectui.picker.frictionlessjoin;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.connectui.picker.frictionlessjoin.model.AvailableSession;
import com.spotify.music.sociallistening.models.Session;
import io.reactivex.functions.l;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

final class e<T, R> implements l<Throwable, Pair<? extends List<? extends AvailableSession>, ? extends List<? extends Session>>> {
    public static final e a = new e();

    e() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Pair<? extends List<? extends AvailableSession>, ? extends List<? extends Session>> apply(Throwable th) {
        Throwable th2 = th;
        h.e(th2, "it");
        Logger.d(th2.getMessage(), th2);
        EmptyList emptyList = EmptyList.a;
        return new Pair<>(emptyList, emptyList);
    }
}
