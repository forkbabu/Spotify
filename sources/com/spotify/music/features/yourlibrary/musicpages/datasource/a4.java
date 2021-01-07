package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.w;

/* access modifiers changed from: package-private */
public final class a4 implements w3 {
    private final PublishSubject<y3> a = PublishSubject.h1();
    final /* synthetic */ w b;

    a4(w wVar) {
        this.b = wVar;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<Boolean> b() {
        return this.a.G0(y3.a).j0(n0.a);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> c() {
        return this.a.G0(y3.a);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> d(s<x3> sVar) {
        s<R> E = sVar.q(this.b).E();
        PublishSubject<y3> publishSubject = this.a;
        publishSubject.getClass();
        return E.N(new r1(publishSubject));
    }
}
