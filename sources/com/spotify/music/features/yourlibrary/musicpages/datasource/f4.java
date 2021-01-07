package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;

/* access modifiers changed from: package-private */
public final class f4 implements w3 {
    private final PublishSubject<y3> a = PublishSubject.h1();
    final /* synthetic */ s b;
    final /* synthetic */ w3 c;
    final /* synthetic */ m4 d;

    f4(s sVar, w3 w3Var, m4 m4Var) {
        this.b = sVar;
        this.c = w3Var;
        this.d = m4Var;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<Boolean> b() {
        return this.a.G0(y3.a).j0(t0.a);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> c() {
        return this.a.G0(y3.b);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> d(s<x3> sVar) {
        s J0 = s.n(this.b, sVar, new u0(this)).J0(new v0(this.c, sVar));
        PublishSubject<y3> publishSubject = this.a;
        publishSubject.getClass();
        return J0.N(new r1(publishSubject));
    }
}
