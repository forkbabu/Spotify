package com.spotify.music.features.podcast.entity.loadedpage.data;

import com.google.common.collect.ImmutableList;
import com.spotify.pageloader.c;
import com.spotify.pageloader.o0;
import com.spotify.podcast.endpoints.l;
import io.reactivex.s;
import io.reactivex.z;
import kotlin.jvm.internal.h;

public final class g {
    private final String a;
    private final l b;

    public g(String str, l lVar) {
        h.e(str, "showUri");
        h.e(lVar, "podcastDecorateEndpoint");
        this.a = str;
        this.b = lVar;
    }

    public o0<a> b() {
        l lVar = this.b;
        ImmutableList<String> of = ImmutableList.of(this.a);
        h.d(of, "ImmutableList.of(showUri)");
        z<R> A = lVar.a(of, new l.a(null, null, null, 7)).A(new d(this));
        h.d(A, "podcastDecorateEndpoint.…, Show> -> map[showUri] }");
        z<R> A2 = A.A(new c(this));
        h.d(A2, "getDecoratedShow().map {…e\n            )\n        }");
        s<R> r0 = A2.P().j0(new f(new PodcastShowLoadableProviderImpl$getLoadStateObservable$1(this))).r0(e.a);
        h.d(r0, "getBaseDataModelSingle()…Error.fromThrowable(it) }");
        c cVar = new c(r0);
        h.d(cVar, "Loadable.from(getLoadStateObservable())");
        return cVar;
    }
}
