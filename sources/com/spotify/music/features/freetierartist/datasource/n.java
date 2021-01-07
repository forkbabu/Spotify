package com.spotify.music.features.freetierartist.datasource;

import com.spotify.music.follow.j;
import com.spotify.music.follow.l;
import io.reactivex.h;

public final /* synthetic */ class n implements l {
    public final /* synthetic */ h a;

    public /* synthetic */ n(h hVar) {
        this.a = hVar;
    }

    @Override // com.spotify.music.follow.l
    public final void g(j jVar) {
        this.a.onNext(jVar);
    }
}
