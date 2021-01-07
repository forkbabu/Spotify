package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;

/* access modifiers changed from: package-private */
public final class g4 implements w3 {
    private final PublishSubject<y3> a = PublishSubject.h1();
    final /* synthetic */ m4 b;
    final /* synthetic */ w3 c;

    g4(m4 m4Var, w3 w3Var) {
        this.b = m4Var;
        this.c = w3Var;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<Boolean> b() {
        return this.a.G0(y3.a).j0(w0.a);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> c() {
        return this.a.G0(y3.a);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> d(s<x3> sVar) {
        m4 m4Var = this.b;
        m4Var.getClass();
        s<R> J0 = sVar.j0(new h0(m4Var)).E().J0(new x0(this.c, sVar));
        PublishSubject<y3> publishSubject = this.a;
        publishSubject.getClass();
        return J0.N(new r1(publishSubject));
    }
}
