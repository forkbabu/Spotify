package com.spotify.music.features.yourlibraryx.search.lifecycle;

import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.l;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class a<Upstream, Downstream> implements w<l, YourLibraryXEvent> {
    public static final a a = new a();

    a() {
    }

    @Override // io.reactivex.w
    public final v<YourLibraryXEvent> apply(s<l> sVar) {
        h.e(sVar, "it");
        return o.a;
    }
}
