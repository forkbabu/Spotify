package com.spotify.music.features.yourepisodes;

import com.spotify.music.features.yourepisodes.interactor.c;
import com.spotify.music.features.yourepisodes.interactor.d;
import com.spotify.pageloader.ObservableLoadable;
import com.spotify.pageloader.o0;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class m implements fjf<o0<s<c>>> {
    private final wlf<d> a;

    public m(wlf<d> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        d dVar = this.a.get();
        h.e(dVar, "listenLaterInteractor");
        return ObservableLoadable.a(yy8.b(dVar, null, 1, null));
    }
}
