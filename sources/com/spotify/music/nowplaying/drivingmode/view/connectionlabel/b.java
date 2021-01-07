package com.spotify.music.nowplaying.drivingmode.view.connectionlabel;

import io.reactivex.h;
import io.reactivex.i;

public final /* synthetic */ class b implements i {
    public final /* synthetic */ e a;

    public /* synthetic */ b(e eVar) {
        this.a = eVar;
    }

    @Override // io.reactivex.i
    public final void subscribe(h hVar) {
        e eVar = this.a;
        hVar.getClass();
        d dVar = new d(hVar);
        hVar.e(new c(eVar, dVar));
        eVar.f.add(dVar);
    }
}
