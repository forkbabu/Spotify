package com.spotify.music.libs.assistedcuration;

import com.spotify.instrumentation.a;
import com.spotify.music.libs.assistedcuration.AssistedCurationLogger;
import com.spotify.ubi.specification.factories.t;

public final class c implements AssistedCurationLogger.a {
    private final wlf<f> a;
    private final wlf<h> b;
    private final wlf<t> c;
    private final wlf<ere> d;

    public c(wlf<f> wlf, wlf<h> wlf2, wlf<t> wlf3, wlf<ere> wlf4) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
        b(wlf4, 4);
        this.d = wlf4;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // com.spotify.music.libs.assistedcuration.AssistedCurationLogger.a
    public AssistedCurationLogger a(a aVar) {
        f fVar = this.a.get();
        b(fVar, 1);
        f fVar2 = fVar;
        h hVar = this.b.get();
        b(hVar, 2);
        h hVar2 = hVar;
        t tVar = this.c.get();
        b(tVar, 3);
        t tVar2 = tVar;
        ere ere = this.d.get();
        b(ere, 4);
        b(aVar, 5);
        return new AssistedCurationLogger(fVar2, hVar2, tVar2, ere, aVar);
    }
}
