package com.spotify.music.features.yourepisodes;

import com.spotify.music.features.yourepisodes.interactor.c;
import com.spotify.pageloader.o0;
import com.spotify.pageloader.t0;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class o implements fjf<t0<s<c>>> {
    private final wlf<zac> a;
    private final wlf<o0<s<c>>> b;

    public o(wlf<zac> wlf, wlf<o0<s<c>>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        zac zac = this.a.get();
        o0<s<c>> o0Var = this.b.get();
        h.e(zac, "pageLoaderFactory");
        h.e(o0Var, "episodesLoadable");
        t0 a2 = zac.a(o0Var);
        h.d(a2, "pageLoaderFactory.create…   episodesLoadable\n    )");
        return a2;
    }
}
