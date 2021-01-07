package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;

/* access modifiers changed from: package-private */
public final class h4 implements w3 {
    private final PublishSubject<y3> a = PublishSubject.h1();
    final /* synthetic */ w3 b;
    final /* synthetic */ n4 c;

    h4(w3 w3Var, n4 n4Var) {
        this.b = w3Var;
        this.c = n4Var;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<Boolean> b() {
        return this.a.G0(y3.a).j0(y0.a);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> c() {
        return this.a.G0(y3.a);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> d(s<x3> sVar) {
        s<R> j0 = this.b.d(sVar).j0(new z0(this.c));
        PublishSubject<y3> publishSubject = this.a;
        publishSubject.getClass();
        return j0.N(new r1(publishSubject));
    }
}
