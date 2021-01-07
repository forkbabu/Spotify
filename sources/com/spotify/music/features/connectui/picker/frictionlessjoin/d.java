package com.spotify.music.features.connectui.picker.frictionlessjoin;

import com.spotify.music.features.connectui.picker.frictionlessjoin.a;
import com.spotify.music.features.connectui.picker.frictionlessjoin.model.AvailableSession;
import com.spotify.music.sociallistening.models.Session;
import io.reactivex.functions.l;
import io.reactivex.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.h;

final class d<T, R> implements l<List<? extends AvailableSession>, v<? extends Pair<? extends List<? extends AvailableSession>, ? extends List<? extends Session>>>> {
    final /* synthetic */ a.c a;

    d(a.c cVar) {
        this.a = cVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public v<? extends Pair<? extends List<? extends AvailableSession>, ? extends List<? extends Session>>> apply(List<? extends AvailableSession> list) {
        List<? extends AvailableSession> list2 = list;
        h.e(list2, "availableSessions");
        FrictionlessJoinManager h = a.h(this.a.a);
        ArrayList arrayList = new ArrayList(kotlin.collections.d.e(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getJoinToken());
        }
        return h.b(arrayList).j0(new c(list2));
    }
}
