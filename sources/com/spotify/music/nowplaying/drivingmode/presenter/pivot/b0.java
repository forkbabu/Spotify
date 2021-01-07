package com.spotify.music.nowplaying.drivingmode.presenter.pivot;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.music.nowplaying.drivingmode.view.pivot.l;
import com.spotify.music.nowplaying.drivingmode.view.pivot.n;
import io.reactivex.functions.c;

public final /* synthetic */ class b0 implements c {
    public static final /* synthetic */ b0 a = new b0();

    private /* synthetic */ b0() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        ImmutableList<l> immutableList = (ImmutableList) obj;
        l lVar = (l) obj2;
        UnmodifiableListIterator<l> listIterator = immutableList.listIterator();
        while (listIterator.hasNext()) {
            l next = listIterator.next();
            if (lVar.b().equals(next.b())) {
                n.a a2 = n.a();
                a2.b(immutableList);
                a2.a(Integer.parseInt(next.c()));
                return a2.build();
            }
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.mo53add((ImmutableList.Builder) lVar);
        builder.addAll((Iterable) immutableList);
        ImmutableList<l> build = builder.build();
        n.a a3 = n.a();
        a3.b(build);
        a3.a(0);
        return a3.build();
    }
}
