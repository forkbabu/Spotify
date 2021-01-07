package com.spotify.music.features.connectui.picker.frictionlessjoin;

import com.spotify.music.features.connectui.picker.frictionlessjoin.model.AvailableSession;
import com.spotify.music.sociallistening.models.Session;
import io.reactivex.functions.l;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.h;

final class c<T, R> implements l<List<? extends Session>, Pair<? extends List<? extends AvailableSession>, ? extends List<? extends Session>>> {
    final /* synthetic */ List a;

    c(List list) {
        this.a = list;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Pair<? extends List<? extends AvailableSession>, ? extends List<? extends Session>> apply(List<? extends Session> list) {
        List<? extends Session> list2 = list;
        h.e(list2, "it");
        return new Pair<>(this.a, list2);
    }
}
