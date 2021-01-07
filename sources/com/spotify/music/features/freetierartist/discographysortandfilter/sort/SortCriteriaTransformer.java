package com.spotify.music.features.freetierartist.discographysortandfilter.sort;

import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import kotlin.jvm.internal.h;

public final class SortCriteriaTransformer implements w<b91, b91> {
    private final b a;

    public SortCriteriaTransformer(b bVar) {
        h.e(bVar, "sortCriteriaRepository");
        this.a = bVar;
    }

    @Override // io.reactivex.w
    public v<b91> apply(s<b91> sVar) {
        h.e(sVar, "upstream");
        s n = s.n(sVar, this.a.c(), new d(new SortCriteriaTransformer$apply$1(this)));
        h.d(n, "Observable.combineLatest…s::sortResponse\n        )");
        return n;
    }
}
