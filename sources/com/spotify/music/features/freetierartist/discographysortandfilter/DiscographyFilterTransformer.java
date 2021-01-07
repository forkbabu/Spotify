package com.spotify.music.features.freetierartist.discographysortandfilter;

import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import kotlin.jvm.internal.h;

public final class DiscographyFilterTransformer implements w<b91, b91> {
    private final d a;

    public DiscographyFilterTransformer(d dVar) {
        h.e(dVar, "discographyFilterRepository");
        this.a = dVar;
    }

    @Override // io.reactivex.w
    public v<b91> apply(s<b91> sVar) {
        h.e(sVar, "upstream");
        s n = s.n(sVar, this.a.a(), new g(new DiscographyFilterTransformer$apply$1(this)));
        h.d(n, "Observable.combineLatest…erUpstreamModel\n        )");
        return n;
    }
}
