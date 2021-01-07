package com.spotify.music.features.yourlibraryx.recentsearch;

import io.reactivex.a;
import io.reactivex.internal.operators.completable.b;
import io.reactivex.s;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

public final class d implements a {
    @Override // com.spotify.music.features.yourlibraryx.recentsearch.a
    public a a(String str) {
        h.e(str, "uri");
        a aVar = b.a;
        h.d(aVar, "Completable.complete()");
        return aVar;
    }

    @Override // com.spotify.music.features.yourlibraryx.recentsearch.a
    public a b(String str) {
        h.e(str, "uri");
        a aVar = b.a;
        h.d(aVar, "Completable.complete()");
        return aVar;
    }

    @Override // com.spotify.music.features.yourlibraryx.recentsearch.a
    public s<List<String>> c() {
        s<List<String>> i0 = s.i0(EmptyList.a);
        h.d(i0, "Observable.just(listOf())");
        return i0;
    }
}
