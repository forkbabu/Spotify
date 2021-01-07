package com.spotify.music.libs.collection.util;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.libs.viewuri.c;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import java.util.Map;

public class k {
    private final CollectionStateProvider a;
    private final c b;
    private final o c;

    public k(CollectionStateProvider collectionStateProvider, o oVar, c cVar) {
        this.a = collectionStateProvider;
        this.c = oVar;
        this.b = cVar;
    }

    public /* synthetic */ s a(String str, ImmutableList immutableList) {
        if (immutableList.isEmpty()) {
            return o.a;
        }
        return this.a.b(this.b.toString(), str, (String[]) immutableList.toArray(new String[0])).q0(b.a);
    }

    public s<Map<String, CollectionStateProvider.a>> b(String str) {
        return this.c.a(str).J0(new e(this, str)).q0(f.a);
    }
}
