package com.spotify.music.features.charts;

import io.reactivex.disposables.b;
import kotlin.jvm.internal.h;

public final class ChartsPresenter {
    private b a;
    private final d b;

    public ChartsPresenter(d dVar) {
        h.e(dVar, "dataSource");
        this.b = dVar;
    }

    public final void a(i iVar) {
        h.e(iVar, "viewBinder");
        b subscribe = this.b.a().subscribe(new f(new ChartsPresenter$viewAvailable$1(iVar)));
        h.d(subscribe, "dataSource.fetch().subsc…viewBinder::setViewModel)");
        this.a = subscribe;
    }

    public final void b() {
        b bVar = this.a;
        if (bVar != null) {
            bVar.dispose();
        } else {
            h.k("disposable");
            throw null;
        }
    }
}
