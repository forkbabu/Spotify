package com.spotify.music.libs.collection.util;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.libs.viewuri.c;

public final class l {
    private final wlf<CollectionStateProvider> a;
    private final wlf<o> b;

    public l(wlf<CollectionStateProvider> wlf, wlf<o> wlf2) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public k b(c cVar) {
        CollectionStateProvider collectionStateProvider = this.a.get();
        a(collectionStateProvider, 1);
        o oVar = this.b.get();
        a(oVar, 2);
        a(cVar, 3);
        return new k(collectionStateProvider, oVar, cVar);
    }
}
